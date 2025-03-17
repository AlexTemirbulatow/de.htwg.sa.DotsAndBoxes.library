ThisBuild / organization := "com.github.AlexTemirbulatow"
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / publishMavenStyle := true
ThisBuild / publishTo := Some(
  "GitHub Packages" at "https://maven.pkg.github.com/AlexTemirbulatow/de.htwg.sa.DotsAndBoxes.library"
)
ThisBuild / credentials += Credentials(
  "GitHub Packages",
  "maven.pkg.github.com",
  sys.env.getOrElse("GITHUB_USERNAME", ""),
  sys.env.getOrElse("GITHUB_TOKEN", "")
)
