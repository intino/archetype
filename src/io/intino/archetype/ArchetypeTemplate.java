package io.intino.archetype;

import io.intino.itrules.RuleSet;
import io.intino.itrules.Template;

public class ArchetypeTemplate extends Template {

	public RuleSet ruleSet() {
		return new RuleSet().add(
			rule().condition((type("archetype"))).output(literal("package ")).output(mark("package")).output(literal(";\n\nimport java.io.File;\nimport java.util.Collections;\n\npublic class Archetype {\n\tprivate final File root;\n\n\tpublic Archetype(File root) {\n\t\tthis.root = root;\n\t\troot.mkdirs();\n\t}\n\n\tpublic File root() {\n\t\treturn this.root;\n\t}\n\n\tpublic Relative relative() {\n\t    return new Relative(root);\n\t}\n\n\tprivate static File createParent(File file) {\n\t    file.getParentFile().mkdirs();\n\t    return file;\n\t}\n\n\t")).output(expression().output(mark("node", "getter").multiple("\n\n"))).output(literal("\n\n\t")).output(expression().output(mark("node", "class").multiple("\n\n"))).output(literal("\n\n\tpublic static class Relative {\n        private final String name;\n        private final File root;\n\n        public Relative(File root) {\n            this.name = \"\";\n            this.root = root;\n            root.mkdirs();\n        }\n\n        public String root() {\n            return this.name;\n        }\n\n        ")).output(expression().output(mark("node", "relativeGetter").multiple("\n\n"))).output(literal("\n\n        ")).output(expression().output(mark("node", "relativeClass").multiple("\n\n"))).output(literal("\n\t}\n}")),
			rule().condition((allTypes("node","leaf","list","regex")), (attribute("parameter")), (trigger("relativegetter"))).output(literal("public java.util.List<String> ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(")).output(mark("parameter", "signature").multiple(", ")).output(literal(") {\n    if(!new File(root, \"")).output(mark("filePath")).output(literal("\").exists()) return Collections.emptyList();\n\treturn java.util.Arrays.stream(new File(root, \"")).output(mark("filePath")).output(literal("\").listFiles()).\n        filter(f-> ")).output(expression().output(mark("with"))).output(mark("parameter", "replace").multiple("")).output(literal(".matches(f.getName())).\n        map(f -> f.getName()).\n        .collect(java.util.stream.Collectors.toList());\n}")),
			rule().condition((allTypes("node","leaf","list")), (trigger("relativegetter"))).output(literal("public java.util.List<String> ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(")).output(expression().output(mark("parameter", "signature").multiple(", "))).output(literal(") {\n    if(!new File(root, \"")).output(mark("filePath")).output(literal("\").exists()) return Collections.emptyList();\n\treturn java.util.Arrays.stream(new File(root, \"")).output(mark("filePath")).output(literal("\").listFiles()).\n        filter(f-> f.getName().contains(")).output(expression().output(mark("with"))).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(")).\n        map(f -> f.getName()).\n        collect(java.util.stream.Collectors.toList());\n}")),
			rule().condition((allTypes("node","leaf")), (attribute("parameter")), (trigger("relativegetter"))).output(literal("public String ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(")).output(mark("parameter", "signature").multiple(", ")).output(literal(") {\n\treturn \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(";\n}")),
			rule().condition((allTypes("node","leaf")), (trigger("relativegetter"))).output(literal("public String ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("() {\n\treturn \"")).output(mark("filePath")).output(literal("\";\n}")),
			rule().condition((allTypes("node","leaf","list","regex")), (trigger("getter"))).output(literal("public java.util.List<File> ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(")).output(expression().output(mark("parameter", "signature").multiple(", "))).output(literal(") {\n    new File(root, \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(").mkdirs();\n\treturn java.util.Arrays.stream(new File(root, \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(").listFiles()).\n\t    filter(f-> ")).output(expression().output(mark("with"))).output(literal(".matches(f.getName())).\n\t    collect(java.util.stream.Collectors.toList());\n}")),
			rule().condition((allTypes("node","leaf","list")), (trigger("getter"))).output(literal("public java.util.List<File> ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(")).output(expression().output(mark("parameter", "signature").multiple(", "))).output(literal(") {\n    new File(root, \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(").mkdirs();\n\treturn java.util.Arrays.stream(new File(root, \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(").listFiles()).\n        filter(f-> f.getName().contains(")).output(expression().output(mark("with"))).output(literal(")).\n        collect(java.util.stream.Collectors.toList());\n}")),
			rule().condition((allTypes("node","leaf")), (trigger("getter"))).output(literal("public File ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(")).output(expression().output(mark("parameter", "signature").multiple(", "))).output(literal(") {\n\treturn createParent(new File(root, \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal("));\n}")),
			rule().condition((allTypes("node","leaf")), (trigger("getter"))).output(literal("public File ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("() {\n\treturn createParent(new File(root, \"")).output(mark("filePath")).output(literal("\"));\n}")),
			rule().condition((allTypes("node","splitted")), (trigger("relativegetter"))).output(literal("public ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(String split) {\n\treturn new ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(root, name, split);\n}\n\npublic ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("Split ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("() {\n\treturn new ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("Split(root);\n}")),
			rule().condition((trigger("split"))).output(literal("public ")).output(mark("class", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" ")).output(mark("value")).output(literal("(String split) {\n\treturn new ")).output(mark("class", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(root, \"")).output(mark("value")).output(literal("\");\n}")),
			rule().condition((type("node")), (trigger("relativegetter"))).output(literal("public ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(")).output(mark("parameter", "signature").multiple(", ")).output(literal(") {\n\treturn new ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(root, name")).output(expression().output(literal(", ")).output(mark("parameter", "name").multiple(", "))).output(literal(");\n}")),
			rule().condition((allTypes("node","splitted")), (trigger("getter"))).output(literal("public ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(String split) {\n\treturn new ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(root, split);\n}\n\npublic ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("Split ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("() {\n\treturn new ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("Split(root);\n}\n\npublic static class ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("Split {\n\tprivate final File root;\n\n\tpublic ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("Split(File root) {\n\t\tthis.root = root;\n\t\troot.mkdirs();\n\t}\n\n\t")).output(mark("split").multiple("\n")).output(literal("\n}")),
			rule().condition((type("node")), (trigger("getter"))).output(literal("public ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" ")).output(mark("name", "snakeCaseToCamelCase", "firstLowerCase")).output(literal("(")).output(mark("parameter", "signature").multiple(", ")).output(literal(") {\n\treturn new ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(root")).output(expression().output(literal(", ")).output(mark("parameter", "name").multiple(", "))).output(literal(");\n}")),
			rule().condition((allTypes("node","splitted")), not(type("leaf")), (trigger("relativeclass"))).output(literal("public static class ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" {\n\tprivate final File root;\n\tprivate final String name;\n\n\tpublic ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(File parentRoot, String parent, String name) {\n\t\tthis.root = new File(parent, name);\n\t\troot.mkdirs();\n\t\tthis.name = parent + (!parent.isEmpty() ? \"/\" : \"\") + name;\n\t}\n\n\tpublic String root() {\n\t\treturn this.name;\n\t}\n\n\t")).output(expression().output(mark("node", "relativeGetter").multiple("\n\n"))).output(literal("\n\n\t")).output(expression().output(mark("node", "relativeClass").multiple("\n\n"))).output(literal("\n}")),
			rule().condition((type("node")), not(type("splitted")), not(type("leaf")), (trigger("relativeclass"))).output(literal("public static class ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" {\n\tprivate final File root;\n\tprivate final String name;\n\n\tpublic ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(File parentRoot, String parent")).output(expression().output(literal(", ")).output(mark("parameter", "signature").multiple(", "))).output(literal(") {\n\t\tthis.root = new File(parent, \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("with"))).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(");\n\t\troot.mkdirs();\n\t\tthis.name = parent + (!parent.isEmpty() ? \"/\" : \"\") + \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("with"))).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(";\n\t}\n\n\tpublic String root() {\n\t\treturn this.name;\n\t}\n\n\t")).output(expression().output(mark("node", "relativeGetter").multiple("\n\n"))).output(literal("\n\n\t")).output(expression().output(mark("node", "relativeClass").multiple("\n\n"))).output(literal("\n}")),
			rule().condition((allTypes("node","splitted")), not(type("leaf")), (trigger("class"))).output(literal("public static class ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" {\n\tprivate final File root;\n\n\tpublic ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(File parent, String name) {\n\t\tthis.root = new File(parent, \"")).output(mark("name")).output(literal("\" + File.separator + name);\n\t\troot.mkdirs();\n\t}\n\n\tpublic File root() {\n\t\treturn this.root;\n\t}\n\n\t")).output(expression().output(mark("node", "getter").multiple("\n\n"))).output(literal("\n\n\t")).output(expression().output(mark("node", "class").multiple("\n\n"))).output(literal("\n}")),
			rule().condition((type("node")), not(type("splitted")), not(type("leaf")), (trigger("class"))).output(literal("public static class ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal(" {\n\tprivate final File root;\n\n\tpublic ")).output(mark("name", "snakeCaseToCamelCase", "firstUpperCase")).output(literal("(File parent")).output(expression().output(literal(", ")).output(mark("parameter", "signature").multiple(", "))).output(literal(") {\n\t\tthis.root = new File(parent, \"")).output(mark("filePath")).output(literal("\"")).output(expression().output(mark("with"))).output(expression().output(mark("parameter", "replace").multiple(""))).output(literal(");\n\t\troot.mkdirs();\n\t}\n\n\tpublic File root() {\n\t\treturn this.root;\n\t}\n\n\t")).output(expression().output(mark("node", "getter").multiple("\n\n"))).output(literal("\n\n\t")).output(expression().output(mark("node", "class").multiple("\n\n"))).output(literal("\n}")),
			rule().condition((type("timetag")), (trigger("signature"))).output(literal("io.intino.alexandria.Timetag ")).output(mark("value")),
			rule().condition((trigger("signature"))).output(literal("String ")).output(mark("value")),
			rule().condition((trigger("name"))).output(mark("value")),
			rule().condition((type("timetag")), (trigger("replace"))).output(literal(".replace(\"{")).output(mark("value")).output(literal("}\", ")).output(mark("value")).output(literal(".toString())")),
			rule().condition((trigger("replace"))).output(literal(".replace(\"{")).output(mark("value")).output(literal("}\", ")).output(mark("value")).output(literal(")"))
		);
	}
}