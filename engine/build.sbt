lazy val settings = Seq(
  organization := "com.kristileka",
  scalaVersion := "2.13.11",
)

lazy val engine =
  project.in(file(".")).settings(name := "engine").settings(settings).settings(libraryDependencies ++= Seq())
