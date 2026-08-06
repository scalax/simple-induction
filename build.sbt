scalaVersion := "3.8.4"

lazy val codegen = (project in (file("") / "codegen"))
  .enablePlugins(SbtTwirl)
  .settings(scalaVersion := scalaV.v213, libraryDependencies ++= libScalax.`os-lib`.value, scalafmtOnCompile := true)

lazy val induction = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .in(file("") / "induction")
  .settings(
    scalaVersion       := scalaV.v213,
    crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3),
    scalafmtOnCompile  := true,
    version            := "0.0.1-M4",
    publishTo          := localStaging.value,
    libraryDependencies ++= libScalax.`scalatest`.value
  )
  .settings(sonaSettings *)

lazy val developer1 = Developer(
  id = "djx314",
  name = "djx314",
  email = "djx314@sina.cn",
  url = uri("https://github.com/djx314")
)

lazy val sonaSettings: Seq[Setting[?]] = List(
  organization         := "net.scalax.simple",
  organizationName     := "Scalax",
  organizationHomepage := Some(uri("https://github.com/scalax")),
  scmInfo              := Some(
    ScmInfo(
      uri("https://github.com/scalax/simple-induction"),
      "scm:git@github.com:scalax/simple-induction.git"
    )
  ),
  developers           := List(developer1),
  description          := "Simple, and scalable. Use it to subvert the author's imagination.",
  licenses             := List(License("MIT License", uri("https://github.com/scalax/simple/blob/main/LICENSE"))),
  homepage             := Some(uri("https://github.com/scalax/simple")),
  pomIncludeRepository := { _ => false },
  publishMavenStyle    := true,
  versionScheme        := Some("early-semver")
)
