package io.intino.archetype;

import io.intino.alexandria.logger.Logger;
import io.intino.archetype.codegeneration.ArchetypeRenderer;
import io.intino.archetype.codegeneration.PomRenderer;
import io.intino.archetype.codegeneration.Project;
import io.intino.archetype.lang.ArchetypeGrammar;
import io.intino.archetype.lang.ArchetypeParser;
import io.intino.archetype.utils.ErrorUtils;
import io.intino.plugin.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static io.intino.plugin.BuildConstants.PRESENTABLE_MESSAGE;

public class ArchetypeCompiler {
	private final CompilerConfiguration configuration;
	private final List<CompilerMessage> messages;
	private final List<PostCompileActionMessage> postCompileActionMessages;

	public ArchetypeCompiler(CompilerConfiguration configuration, List<CompilerMessage> messages, List<PostCompileActionMessage> postCompileActionMessages) {
		this.configuration = configuration;
		this.messages = messages;
		this.postCompileActionMessages = postCompileActionMessages;
	}

	public List<OutputItem> compile() {
		configuration.out().println(PRESENTABLE_MESSAGE + "Archetypec: Building " + configuration.artifactId() + " archetypes...");
		File tempDir = tempDirectory();
		try {
			run(tempDir);
		} catch (IOException | IntinoException e) {
			messages.add(new CompilerMessage(CompilerMessage.ERROR, ErrorUtils.getMessage(e)));
		}
		return List.of();
	}

	public void run(File tempDir) throws IOException, IntinoException {
		File outDirectory = configuration.outDirectory();
		File archetype = configuration.sources().stream().map(f -> FileUtils.listFiles(f, new String[]{"archetype"}, true)).flatMap(Collection::stream).findFirst().orElse(null);
		if (!outDirectory.exists()) {
			messages.add(new CompilerMessage(CompilerMessage.ERROR, "Compiled model not found. Please compile module"));
			return;
		}
		final ArchetypeGrammar.RootContext tree = read(archetype);

		List<Project> projects = createSources(tempDir, tree);
		projects.stream().map(this::actionMessage).forEach(postCompileActionMessages::add);
		configuration.out().println(PRESENTABLE_MESSAGE + "Archetypec: Finished generation of archetypes!");
	}

	private MavenBuildActionMessage actionMessage(Project project) {
		return new MavenBuildActionMessage(configuration.module(), project.pom(), project.coords(), configuration.phase().name());
	}

	private ArchetypeGrammar.RootContext read(File archetype) throws IntinoException {
		return new ArchetypeParser(archetype).parse();
	}

	private List<Project> createSources(File tempDir, ArchetypeGrammar.RootContext tree) throws IntinoException {
		List<Project> list = new ArrayList<>();
		for (String target : findTargets(tree.header())) list.add(rendertarget(tempDir, tree, target));
		return list;
	}

	private Project rendertarget(File tempDir, ArchetypeGrammar.RootContext tree, String target) throws IntinoException {
		File root = new File(tempDir, target);
		File srcDirectory = new File(root, "src");
		srcDirectory.mkdirs();
		new ArchetypeRenderer(configuration, tree, target, srcDirectory).render();
		PomRenderer pomRenderer = new PomRenderer(configuration, root, target);
		return new Project(pomRenderer.coors(), pomRenderer.render());
	}


	private List<String> findTargets(ArchetypeGrammar.HeaderContext header) {
		return header.IDENTIFIER().stream().map(ParseTree::getText).collect(Collectors.toList());
	}

	private File tempDirectory() {
		try {
			return Files.createTempDirectory("_temp").toFile();
		} catch (IOException e) {
			Logger.error(e);
			return new File("");
		}
	}
}