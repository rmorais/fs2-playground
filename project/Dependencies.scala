import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val fs2 = "co.fs2" %% "fs2-core" % "0.10.5"
  lazy val catsEffect = "org.typelevel" %% "cats-effect" % "1.0.0-RC2"

}
