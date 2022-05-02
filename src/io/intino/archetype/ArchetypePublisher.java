package io.intino.archetype;

import io.intino.Configuration;
import io.intino.Configuration.Artifact;
import io.intino.archetype.lang.ArchetypeGrammar;
import io.intino.itrules.FrameBuilder;
import io.intino.plugin.PluginLauncher;
import org.apache.maven.shared.invoker.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static io.intino.plugin.PluginLauncher.Phase.*;

class ArchetypePublisher {
	private final File root;
	private final ArchetypeGrammar.RootContext tree;
	private final String target;
	private final Configuration conf;
	private final PluginLauncher.SystemProperties systemProperties;
	private final String basePackage;
	private final PluginLauncher.Phase invokedPhase;
	private final PrintStream logger;
	private final PluginLauncher.Notifier notifier;

	ArchetypePublisher(File root, ArchetypeGrammar.RootContext tree, String target, Configuration configuration, PluginLauncher.SystemProperties systemProperties, PluginLauncher.Phase invokedPhase, PrintStream logger, PluginLauncher.Notifier notifier) {
		this.root = root;
		this.tree = tree;
		this.target = target;
		this.conf = configuration;
		this.systemProperties = systemProperties;
		this.basePackage = configuration.artifact().groupId().toLowerCase();
		this.invokedPhase = invokedPhase;
		this.logger = logger;
		this.notifier = notifier;
	}

	boolean publish() {
		try {
			if (!checkPublish() || !createSources()) return false;
			logger.println("Publishing archetype for " + target + "...");
			mvn(invokedPhase == INSTALL ? "install" : "deploy");
			logger.println("Archetype for " + target + " published!");
			return true;
		} catch (Throwable e) {
			logger.println(e.getMessage() == null ? e.toString() : e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	private boolean checkPublish() {
		try {
			Version version = new Version(conf.artifact().version());
			if (!version.isSnapshot() && (invokedPhase == DISTRIBUTE || invokedPhase == DEPLOY) && isDistributed(conf.artifact()))
				return false;
		} catch (IntinoException e) {
			return false;
		}
		return true;
	}

	private boolean createSources() {
		File srcDirectory = new File(root, "src");
		srcDirectory.mkdirs();
		new ArchetypeRenderer(conf, tree, target, srcDirectory).render();
		return true;
	}


	private String archetypeNameArtifact() {
		return Formatters.firstLowerCase(Formatters.camelCaseToSnakeCase().format(target).toString()+"-archetype");
	}

	private void mvn(String goal) throws IOException, MavenInvocationException {
		final File pom = createPom(root, basePackage, archetypeNameArtifact(), conf.artifact().version());
		final InvocationResult result = invoke(pom, goal);
		if (result != null && result.getExitCode() != 0) {
			if (result.getExecutionException() != null)
				throw new IOException("Failed to publish accessor.", result.getExecutionException());
			else throw new IOException("Failed to publish accessor. Exit code: " + result.getExitCode());
		} else if (result == null) throw new IOException("Failed to publish accessor. Maven HOME not found");
	}

	private InvocationResult invoke(File pom, String goal) throws MavenInvocationException {
		List<String> goals = new ArrayList<>();
		goals.add("clean");
		goals.add("install");
		if (!goal.isEmpty()) goals.add(goal);
		InvocationRequest request = new DefaultInvocationRequest().setPomFile(pom).setGoals(goals);
		Invoker invoker = new DefaultInvoker().setMavenHome(systemProperties.mavenHome);
		log(invoker);
		config(request, systemProperties.mavenHome);
		return invoker.execute(request);
	}

	private void log(Invoker invoker) {
		invoker.setErrorHandler(logger::println);
//		invoker.setOutputHandler(logger::println);
	}

	private void config(InvocationRequest request, File mavenHome) {
		final File mvn = new File(mavenHome, "bin" + File.separator + "mvn");
		mvn.setExecutable(true);
		request.setJavaHome(systemProperties.javaHome);
	}


	private File createPom(File root, String group, String artifact, String version) {
		final FrameBuilder builder = new FrameBuilder("pom").add("group", group).add("artifact", artifact).add("version", version);
		conf.repositories().forEach(r -> buildRepoFrame(builder, r));
		if (conf.artifact().distribution() != null) {
			if (isSnapshotVersion()) buildDistroFrame(builder, conf.artifact().distribution().snapshot());
			else buildDistroFrame(builder, conf.artifact().distribution().release());
		}
		builder.add("terminal", terminalDependenciesFrame(group, version));
		final File pomFile = new File(root, "pom.xml");
		Commons.write(pomFile.toPath(), new PomTemplate().render(builder.toFrame()));
		return pomFile;
	}

	private boolean isSnapshotVersion() {
		return conf.artifact().version().contains("SNAPSHOT");
	}

	private FrameBuilder terminalDependenciesFrame(String group, String version) {
		return new FrameBuilder("terminal").
				add("group", group).
				add("artifact", "ontology").
				add("version", version);
	}

	private void buildRepoFrame(FrameBuilder builder, Configuration.Repository r) {
		builder.add("repository", createRepositoryFrame(r).toFrame());
	}

	private void buildDistroFrame(FrameBuilder builder, Configuration.Repository r) {
		builder.add("repository", createRepositoryFrame(r).add("distribution").toFrame());
	}

	private FrameBuilder createRepositoryFrame(Configuration.Repository repository) {
		return new FrameBuilder("repository", repository.getClass().getSimpleName()).
				add("name", repository.identifier()).
				add("random", UUID.randomUUID().toString()).
				add("url", repository.url());
	}

	protected boolean isDistributed(Artifact artifact) {
		String identifier = artifact.groupId() + ":" + artifact.name().toLowerCase();
		if (artifact.distribution() == null) return false;
		if (true) return false; //TODO falta inyectar credenciales
		List<String> versions = ArtifactoryConnector.versions(conf.artifact().distribution().release(), identifier);
		return versions.contains(artifact.version());
	}


}