package io.intino.archetype;

import io.intino.alexandria.logger.Logger;
import io.intino.archetype.lang.ArchetypeGrammar;
import io.intino.archetype.lang.ArchetypeParser;
import io.intino.plugin.PluginLauncher;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Main extends PluginLauncher {

	@Override
	public void run() {
		if (invokedPhase.ordinal() < 2) return;
		logger().println("Building archetypes...");
		File tempDir = tempDirectory();
		run(tempDir);
	}

	public void run(File tempDir) {
		if (logger() != null) logger().println("Maven HOME: " + systemProperties.mavenHome.getAbsolutePath());
		List<File> srcDirectories = moduleStructure().sourceDirectories;
		File archetype = srcDirectories.stream().map(f -> FileUtils.listFiles(f, new String[]{"archetype"}, true)).flatMap(Collection::stream).findFirst().orElse(null);
		if (archetype == null) {
			notifier().notifyError("Archetype not found. Please create it");
			return;
		}
		final ArchetypeGrammar.RootContext archetypeTree = read(archetype);
		if (safe(() -> configuration().artifact().distribution()) != null && safe(() -> configuration().artifact().distribution().snapshot()) == null && isSnapshotVersion()) {
			notifier().notifyError("Snapshot distribution repository not found");
			return;
		}
		if (publishArchetypes(archetypeTree, tempDir)) logger().println("Finished generation of archetype!");
	}

	private ArchetypeGrammar.RootContext read(File archetype) {
		try {
			return new ArchetypeParser(archetype).parse();
		} catch (IntinoException e) {
			notifier().notifyError(e.getMessage());
			return null;
		}
	}

	private List<String> findTargets(ArchetypeGrammar.HeaderContext header) {
		return header.IDENTIFIER().stream().map(ParseTree::getText).collect(Collectors.toList());
	}


	private boolean publishArchetypes(ArchetypeGrammar.RootContext root, File tempDir) {
		AtomicBoolean published = new AtomicBoolean(true);
		try {
			findTargets(root.header()).parallelStream().forEach(t -> {
				published.set(new ArchetypePublisher(new File(tempDir, t), root, t, configuration(), systemProperties(), invokedPhase, logger(), notifier()).publish() & published.get());
				if (published.get() && notifier() != null)
					notifier().notify("Archetype for " + t + " " + participle() + ". Copy maven dependency:\n" + accessorDependency(configuration().artifact().groupId() + "." + Formatters.snakeCaseToCamelCase().format(configuration().artifact().name()).toString().toLowerCase(), archetypeNameArtifact(t), configuration().artifact().version()));
			});
			if (published.get()) FileUtils.deleteDirectory(tempDir);
			return published.get();
		} catch (Throwable e) {
			logger().println(e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	private String archetypeNameArtifact(String target) {
		return Formatters.firstLowerCase(Formatters.camelCaseToSnakeCase().format(target).toString());
	}

	private boolean isSnapshotVersion() {
		return configuration().artifact().version().contains("SNAPSHOT");
	}


	private String participle() {
		return invokedPhase == Phase.INSTALL ? "installed" : "distributed";
	}

	private String accessorDependency(String groupId, String artifactId, String version) {
		return "<dependency>\n" +
				"    <groupId>" + groupId.toLowerCase() + "</groupId>\n" +
				"    <artifactId>" + artifactId.toLowerCase() + "</artifactId>\n" +
				"    <version>" + version + "</version>\n" +
				"</dependency>";
	}

	private File tempDirectory() {
		try {
			return Files.createTempDirectory("_temp").toFile();
		} catch (IOException e) {
			Logger.error(e);
			return new File("");
		}
	}

	public static <T> T safe(Safe.Wrapper<T> wrapper) {
		try {
			return wrapper.value();
		} catch (Throwable var2) {
			return null;
		}
	}
}