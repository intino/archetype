import io.intino.Configuration;
import io.intino.archetype.Main;
import io.intino.plugin.PluginLauncher;
import org.apache.commons.io.FileUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static java.util.Collections.singletonList;

@Ignore
public class PluginTest {
	@Test
	public void should_build_test_terminals() throws IOException {
		File temp = new File(System.getProperty("user.home") + "/workspace/archetype/temp/test");
		FileUtils.deleteDirectory(temp);
		Main launcher = new Main();
		launcher.
				moduleStructure(new PluginLauncher.ModuleStructure(singletonList(new File(System.getProperty("user.home") + "/IdeaProjects/prueba/archetype/src/")), singletonList(new File(System.getProperty("user.home") + "/IdeaProjects/prueba/archetype/res")), new File(System.getProperty("user.home") + "/IdeaProjects/prueba/out/archetype/")))
				.systemProperties(new PluginLauncher.SystemProperties(new File("/Applications/IntelliJ IDEA.app/Contents/plugins/maven/lib/maven3/"), new File("/Library/Java/JavaVirtualMachines/jdk-11.0.4.jdk/Contents/Home")))
				.logger(System.out)
				.invokedPhase(PluginLauncher.Phase.INSTALL)
				.moduleConfiguration(testConfiguration());
		temp.mkdirs();
		launcher.run(temp);
	}

	@Test
	public void should_build_gc_terminals() throws IOException {
		Main launcher = new Main();
		launcher.
				moduleStructure(new PluginLauncher.ModuleStructure(List.of(new File(System.getProperty("user.home") + "/workspace/cfe/suministro/core/data-hub-ng/src"), new File(System.getProperty("user.home") + "/workspace/cfe/suministro/core/data-hub-ng/shared")), singletonList(new File(System.getProperty("user.home") + "/workspace/cfe/suministro/core/data-hub-ng/res")), new File(System.getProperty("user.home") + "/workspace/ness/out/data-hub-ng-test/")))
				.systemProperties(new PluginLauncher.SystemProperties(new File("/Applications/IntelliJ IDEA.app/Contents/plugins/maven/lib/maven3/"), new File("/Library/Java/JavaVirtualMachines/jdk-11.0.4.jdk/Contents/Home")))
				.logger(System.out)
				.invokedPhase(PluginLauncher.Phase.INSTALL)
				.moduleConfiguration(gcConfiguration());
		File temp = new File(System.getProperty("user.home") + "/workspace/ness/datahubterminalplugin/temp/gc");
		FileUtils.deleteDirectory(temp);
		temp.mkdirs();
		launcher.run(temp);
	}

	@Test
	public void should_build_cesar_terminal() throws IOException {
		Main launcher = new Main();
		launcher.
				moduleStructure(new PluginLauncher.ModuleStructure(singletonList(new File(System.getProperty("user.home") + "/workspace/cesar/data-hub/src")), singletonList(new File(System.getProperty("user.home") + "/workspace/cesar/data-hub/res")), new File(System.getProperty("user.home") + "/workspace/ness/out/data-hub-test/")))
				.systemProperties(new PluginLauncher.SystemProperties(new File("/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/"), new File("/Library/Java/JavaVirtualMachines/jdk-11.0.4.jdk/Contents/Home")))
				.logger(System.out)
				.notifier(notifier())
				.invokedPhase(PluginLauncher.Phase.INSTALL)
				.moduleConfiguration(cesarConfiguration());
		File temp = new File(System.getProperty("user.home") + "/workspace/ness/datahubterminalplugin/temp");
		FileUtils.deleteDirectory(temp);

		temp.mkdirs();
		launcher.run(temp);
	}

	private PluginLauncher.Notifier notifier() {
		return new PluginLauncher.Notifier() {
			@Override
			public void notify(String s) {
				System.out.println(s);
			}

			@Override
			public void notifyError(String s) {
				System.err.println(s);
			}
		};
	}


	private Configuration cesarConfiguration() {
		return new Configuration() {
			@Override
			public Artifact artifact() {
				return new Artifact() {
					@Override
					public String groupId() {
						return "io.intino.cesar";
					}

					@Override
					public String name() {
						return "datahub";
					}

					@Override
					public String version() {
						return "1.0.0";
					}

					@Override
					public String description() {
						return null;
					}

					@Override
					public String url() {
						return null;
					}

					@Override
					public void version(String s) {

					}

					@Override
					public Code code() {
						return new Code() {
							@Override
							public String generationPackage() {
								return "io.intino.cesar.datahub";
							}

							@Override
							public String nativeLanguage() {
								return null;
							}

							@Override
							public Configuration root() {
								return null;
							}

							@Override
							public ConfigurationNode owner() {
								return null;
							}
						};
					}

					@Override
					public Model model() {
						return null;
					}

					@Override
					public Box box() {
						return null;
					}

					@Override
					public Dependency.DataHub datahub() {
						return null;
					}

					@Override
					public Dependency.Archetype archetype() {
						return null;
					}

					@Override
					public List<Dependency> dependencies() {
						return null;
					}

					@Override
					public List<WebComponent> webComponents() {
						return null;
					}

					@Override
					public List<WebResolution> webResolutions() {
						return null;
					}

					@Override
					public List<WebArtifact> webArtifacts() {
						return null;
					}

					@Override
					public List<Plugin> plugins() {
						return null;
					}

					@Override
					public License license() {
						return null;
					}

					@Override
					public Scm scm() {
						return null;
					}

					@Override
					public List<Developer> developers() {
						return null;
					}


					@Override
					public QualityAnalytics qualityAnalytics() {
						return null;
					}

					@Override
					public List<Parameter> parameters() {
						return null;
					}

					@Override
					public Package packageConfiguration() {
						return null;
					}

					@Override
					public Distribution distribution() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				};
			}

			@Override
			public List<Server> servers() {
				return null;
			}

			@Override
			public List<RunConfiguration> runConfigurations() {
				return null;
			}

			@Override
			public List<Repository> repositories() {
				return List.of(new Repository() {
					@Override
					public String identifier() {
						return "intino-maven";
					}

					@Override
					public String url() {
						return "https://artifactory.intino.io/artifactory/release-libraries";
					}

					@Override
					public String user() {
						return null;
					}

					@Override
					public String password() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				}, new Repository() {
					@Override
					public String identifier() {
						return "intino-maven";
					}

					@Override
					public String url() {
						return "https://artifactory.intino.io/artifactory/release-libraries";
					}

					@Override
					public String user() {
						return null;
					}

					@Override
					public String password() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				});
			}
		};
	}

	private Configuration gcConfiguration() {
		return new Configuration() {
			@Override
			public Artifact artifact() {
				return new Artifact() {
					@Override
					public String groupId() {
						return "io.provista";
					}

					@Override
					public String name() {
						return "datahub";
					}

					@Override
					public String version() {
						return "3.1.0";
					}

					@Override
					public String description() {
						return null;
					}

					@Override
					public String url() {
						return null;
					}

					@Override
					public void version(String s) {

					}

					@Override
					public Code code() {
						return null;
					}

					@Override
					public Model model() {
						return null;
					}

					@Override
					public Box box() {
						return null;
					}

					@Override
					public Dependency.DataHub datahub() {
						return null;
					}

					@Override
					public Dependency.Archetype archetype() {
						return null;
					}

					@Override
					public List<Dependency> dependencies() {
						return null;
					}

					@Override
					public List<WebComponent> webComponents() {
						return null;
					}

					@Override
					public List<WebResolution> webResolutions() {
						return null;
					}

					@Override
					public List<WebArtifact> webArtifacts() {
						return null;
					}

					@Override
					public List<Plugin> plugins() {
						return null;
					}

					@Override
					public License license() {
						return null;
					}

					@Override
					public Scm scm() {
						return null;
					}

					@Override
					public List<Developer> developers() {
						return null;
					}

					@Override
					public QualityAnalytics qualityAnalytics() {
						return null;
					}

					@Override
					public List<Parameter> parameters() {
						return null;
					}

					@Override
					public Package packageConfiguration() {
						return null;
					}

					@Override
					public Distribution distribution() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				};
			}

			@Override
			public List<Server> servers() {
				return null;
			}

			@Override
			public List<RunConfiguration> runConfigurations() {
				return null;
			}

			@Override
			public List<Repository> repositories() {
				return List.of(new Repository() {
					@Override
					public String identifier() {
						return "intino-maven";
					}

					@Override
					public String url() {
						return "https://artifactory.intino.io/artifactory/release-libraries";
					}

					@Override
					public String user() {
						return null;
					}

					@Override
					public String password() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				}, new Repository() {
					@Override
					public String identifier() {
						return "intino-maven";
					}

					@Override
					public String url() {
						return "https://artifactory.intino.io/artifactory/release-libraries";
					}

					@Override
					public String user() {
						return null;
					}

					@Override
					public String password() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				});
			}
		};
	}

	private Configuration testConfiguration() {
		return new Configuration() {
			@Override
			public Artifact artifact() {
				return new Artifact() {
					@Override
					public String groupId() {
						return "io.intino.test";
					}

					@Override
					public String name() {
						return "archetype";
					}

					@Override
					public String version() {
						return "1.0.0-SNAPSHOT";
					}

					@Override
					public String description() {
						return null;
					}

					@Override
					public String url() {
						return null;
					}

					@Override
					public void version(String s) {

					}

					@Override
					public Code code() {
						return new Code() {
							@Override
							public String generationPackage() {
								return "io.intino.test.archetype";
							}

							@Override
							public String nativeLanguage() {
								return null;
							}

							@Override
							public Configuration root() {
								return null;
							}

							@Override
							public ConfigurationNode owner() {
								return null;
							}
						};
					}

					@Override
					public Model model() {
						return null;
					}

					@Override
					public Box box() {
						return null;
					}

					@Override
					public Dependency.DataHub datahub() {
						return null;
					}

					@Override
					public Dependency.Archetype archetype() {
						return null;
					}

					@Override
					public List<Dependency> dependencies() {
						return null;
					}

					@Override
					public List<WebComponent> webComponents() {
						return null;
					}

					@Override
					public List<WebResolution> webResolutions() {
						return null;
					}

					@Override
					public List<WebArtifact> webArtifacts() {
						return null;
					}

					@Override
					public List<Plugin> plugins() {
						return null;
					}

					@Override
					public License license() {
						return null;
					}

					@Override
					public Scm scm() {
						return null;
					}

					@Override
					public List<Developer> developers() {
						return null;
					}

					@Override
					public QualityAnalytics qualityAnalytics() {
						return null;
					}

					@Override
					public List<Parameter> parameters() {
						return null;
					}

					@Override
					public Package packageConfiguration() {
						return null;
					}

					@Override
					public Distribution distribution() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				};
			}

			@Override
			public List<Server> servers() {
				return null;
			}

			@Override
			public List<RunConfiguration> runConfigurations() {
				return null;
			}

			@Override
			public List<Repository> repositories() {
				return List.of(new Repository() {
					@Override
					public String identifier() {
						return "intino-maven";
					}

					@Override
					public String url() {
						return "https://artifactory.intino.io/artifactory/release-libraries";
					}

					@Override
					public String user() {
						return null;
					}

					@Override
					public String password() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				}, new Repository() {
					@Override
					public String identifier() {
						return "intino-maven";
					}

					@Override
					public String url() {
						return "https://artifactory.intino.io/artifactory/release-libraries";
					}

					@Override
					public String user() {
						return null;
					}

					@Override
					public String password() {
						return null;
					}

					@Override
					public Configuration root() {
						return null;
					}

					@Override
					public ConfigurationNode owner() {
						return null;
					}
				});
			}
		};
	}
}