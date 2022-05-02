package io.intino.archetype;

import io.intino.Configuration;
import io.intino.alexandria.logger.Logger;
import io.intino.archetype.lang.ArchetypeGrammar;
import io.intino.itrules.Frame;
import io.intino.itrules.FrameBuilder;
import io.intino.itrules.Template;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Objects;


public class ArchetypeRenderer {

	private final Configuration config;
	private final ArchetypeGrammar.RootContext tree;
	private final String target;
	private final File srcDirectory;

	public ArchetypeRenderer(Configuration config, ArchetypeGrammar.RootContext tree, String target, File srcDirectory) {
		this.config = config;
		this.tree = tree;
		this.target = target;
		this.srcDirectory = srcDirectory;
	}

	public void render() {
		FrameBuilder builder = new FrameBuilder("archetype");
		final String generationPackage = generationPackage();
		builder.add("package", generationPackage).add("artifact", target);
		builder.add("node", tree.node().stream().map(this::frameOf).filter(Objects::nonNull).toArray(Frame[]::new));
		writeFrame(new File(srcDirectory, generationPackage.replace(".", "/")), Formatters.snakeCaseToCamelCase().format("Archetype").toString(), template().render(builder.toFrame()));
	}

	private String generationPackage() {
		return config.artifact().code().generationPackage();
	}

	private Frame frameOf(ArchetypeGrammar.NodeContext node) {
		String nodeName = node.declaration().IDENTIFIER().toString().replace(".", "_");
		FrameBuilder builder = new FrameBuilder("node").
				add("name", nodeName).
				add("artifact", target);
		if (isLeaf(node)) builder.add("leaf");
		if (isSplitted(node)) {
			Frame[] splits = node.declaration().splitted().IDENTIFIER().stream().
					map(Object::toString).
					map(s -> new FrameBuilder("split").add("class", nodeName).add("value", s).toFrame()).toArray(Frame[]::new);
			builder.add("splitted").add("split", splits);
		}
		String parentIn = null;
		if (isModuleSplit(node)) {
			if (hasIn(node)) parentIn = node.declaration().LABEL(0).toString().replace("\"", "");
			node = findNodeModule(node);
			if (node == null) return null;
		}
		if (node.declaration().parameters() != null)
			builder.add("parameter", node.declaration().parameters().parameter().stream().
					map(p -> new FrameBuilder("parameter", type(p.type())).add("value", p.IDENTIFIER().toString()).toFrame()).
					toArray(Frame[]::new));
		if (hasIn(node))
			builder.add("filePath", (parentIn != null ? parentIn + "/" : "") + node.declaration().LABEL(0).toString().replace("\"", ""));
		else
			builder.add("filePath", (parentIn != null ? parentIn + "/" : "") + node.declaration().IDENTIFIER().toString());
		if (node.declaration().WITH() != null)
			builder.add("list").add(type(node.declaration().type())).
					add("with", node.declaration().LABEL(node.declaration().LABEL().size() - 1).toString());
		if (node.body() != null && !node.body().node().isEmpty())
			builder.add("node", node.body().node().stream().map(this::frameOf).toArray(Frame[]::new));
		return builder.toFrame();
	}

	private boolean isSplitted(ArchetypeGrammar.NodeContext node) {
		return node.declaration().splitted() != null;
	}

	private boolean hasIn(ArchetypeGrammar.NodeContext node) {
		return node.declaration().IN() != null;
	}

	private boolean isModuleSplit(ArchetypeGrammar.NodeContext node) {
		return node.declaration().starting().STAR() != null;
	}

	private boolean isLeaf(ArchetypeGrammar.NodeContext node) {
		return node.declaration().starting().MINUS() != null;
	}

	private ArchetypeGrammar.NodeContext findNodeModule(ArchetypeGrammar.NodeContext node) {
		return node.body().node().stream().filter(n -> n.declaration().IDENTIFIER().toString().equalsIgnoreCase(target)).findFirst().orElse(null);
	}

	private String type(ArchetypeGrammar.TypeContext p) {
		if (p == null) return "default";
		if (p.REGEX() != null) return "regex";
		return "timetag";
	}

	private Template template() {
		return Formatters.customize(new ArchetypeTemplate());
	}


	private void writeFrame(File packageFolder, String name, String text) {
		try {
			packageFolder.mkdirs();
			File file = javaFile(packageFolder, name);
			Files.write(file.toPath(), text.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			Logger.error(e.getMessage(), e);
		}
	}

	private File javaFile(File packageFolder, String name) {
		return preparedFile(packageFolder, name, "java");
	}

	private File preparedFile(File packageFolder, String name, String extension) {
		return new File(packageFolder, prepareName(name) + "." + extension);
	}

	private String prepareName(String name) {
		return name.isEmpty() ? name : Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}

}
