val scala3Version = "3.6.4"
val libVersion = "0.2.1-SNAPSHOT"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotsandboxes",
    version := libVersion,
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
