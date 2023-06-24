name := "Base"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.11"

lazy val base = project.in(file(".")).enablePlugins(PlayScala, PlayNettyServer).dependsOn(
  engine
).aggregate(engine).settings(
  name := """testProject""",
  libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
  ))

lazy val engine = ProjectRef(file("../engine"), "engine")