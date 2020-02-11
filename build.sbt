ThisBuild / scalaVersion := "2.12.10"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.ruimorais"
ThisBuild / organizationName := "RuiMorais"

lazy val root = (project in file("."))
  .settings(
    name := "fs2-playground",
    libraryDependencies ++= Seq(
      "co.fs2" %% "fs2-core" % "2.2.1",
      "org.typelevel" %% "cats-effect" % "2.1.1",
      "org.scalatest" %% "scalatest" % "3.1.0" % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
