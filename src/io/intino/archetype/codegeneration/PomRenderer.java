package io.intino.archetype.codegeneration;

import io.intino.Configuration;
import io.intino.archetype.IntinoException;
import io.intino.itrules.FrameBuilder;
import io.intino.plugin.CompilerConfiguration;

import java.io.File;
import java.util.UUID;

import static io.intino.archetype.ArtifactoryConnector.versions;
import static io.intino.archetype.codegeneration.Formatters.camelCaseToSnakeCase;
import static io.intino.plugin.CompilerConfiguration.Phase.DISTRIBUTE;

public class PomRenderer {
	private final CompilerConfiguration configuration;
	private final File root;
	private final String target;

	public PomRenderer(CompilerConfiguration configuration, File root, String target) {
		this.configuration = configuration;
		this.root = root;
		this.target = target;
	}

	public File render() throws IntinoException {
		if (configuration.phase().equals(DISTRIBUTE) && !isSnapshotVersion() && isDistributed())
			return null;
		final FrameBuilder builder = new FrameBuilder("pom").add("group", configuration.groupId())
				.add("artifact", archetypeNameArtifact()).add("version", configuration.version());
		for (Configuration.Repository r : configuration.repositories()) buildRepoFrame(builder, r);
		if (configuration.releaseDistributionRepository() != null || configuration.snapshotDistributionRepository() != null) {
			if (isSnapshotVersion()) buildDistroFrame(builder, configuration.snapshotDistributionRepository());
			else buildDistroFrame(builder, configuration.releaseDistributionRepository());
		}
		final File pomFile = new File(root, "pom.xml");
		Commons.write(pomFile.toPath(), new PomTemplate().render(builder.toFrame()));
		return pomFile;
	}

	public String coors() {
		return String.join(":", configuration.groupId(), archetypeNameArtifact(), configuration.version());
	}

	private boolean isSnapshotVersion() {
		return configuration.version().contains("SNAPSHOT");
	}

	private void buildRepoFrame(FrameBuilder builder, Configuration.Repository r) throws IntinoException {
		if (r == null) throw new IntinoException("Repository not found");
		builder.add("repository", createRepositoryFrame(r).toFrame());
	}

	private void buildDistroFrame(FrameBuilder builder, Configuration.Repository r) throws IntinoException {
		if (r == null) throw new IntinoException("Repository not found");
		builder.add("repository", createRepositoryFrame(r).add("distribution").toFrame());
	}

	private FrameBuilder createRepositoryFrame(Configuration.Repository repository) {
		return new FrameBuilder("repository", repository.getClass().getSimpleName()).
				add("name", repository.identifier()).
				add("random", UUID.randomUUID().toString()).
				add("url", repository.url());
	}

	private String archetypeNameArtifact() {
		return Formatters.firstLowerCase(camelCaseToSnakeCase().format(target).toString() + "-archetype");
	}

	private boolean isDistributed() {
		String identifier = configuration.groupId() + archetypeNameArtifact();
		if (configuration.releaseDistributionRepository() == null) return false;
		return versions(configuration.releaseDistributionRepository(), identifier).stream()
				.anyMatch(v -> v.get().equals(configuration.version()));
	}

}
