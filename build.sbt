val scala3Version = "3.6.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "DotsAndBoxesSA_Library",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
  )

ThisBuild / organization := "com.github.AlexTemirbulatow"
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / publishMavenStyle := true
ThisBuild / publishTo := Some(
  "GitHub Packages" at "https://maven.pkg.github.com/AlexTemirbulatow/de.htwg.sa.DotsAndBoxes.library"
)
ThisBuild / credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  sys.env.getOrElse("GITHUB_USERNAME", ""),
  sys.env.getOrElse("GITHUB_TOKEN", "")
)
