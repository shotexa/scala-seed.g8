import sbt._

object Dependencies {
  val test = Seq(
    "org.scalatest"     %% "scalatest"       % "3.2.3",
    "org.scalacheck"    %% "scalacheck"      % "1.15.1",
    "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0"
  )
  val core = Seq(
    "com.lihaoyi" %% "os-lib" % "0.7.1"
  )
}
