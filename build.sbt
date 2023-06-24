name := """android-integrity-server"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).dependsOn(base).aggregate(base)

lazy val base = ProjectRef(file("base"), "base")
scalaVersion := "2.13.11"