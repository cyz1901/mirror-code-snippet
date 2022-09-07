//new
lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalablyTypedConverterExternalNpmPlugin)
  .settings(
    scalaVersion := "3.1.3",
    version := "0.1.0-SNAPSHOT",
    name := "mirror-code-snippet",
    idePackagePrefix := Some("per.cyz.snippet"),
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.CommonJSModule)
        .withModuleSplitStyle(
          org.scalajs.linker.interface.ModuleSplitStyle
            .SmallModulesFor(List("root"))
        )
    },
    useYarn := true,
    stFlavour := Flavour.ScalajsReact,
    externalNpm := {
      scala.sys.process.Process("yarn", baseDirectory.value).!
      baseDirectory.value
    },
    stIgnore := List("esbuild-darwin-arm64"),
    libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
    Compile / fastOptJS / crossTarget := file("optjs")
  )
