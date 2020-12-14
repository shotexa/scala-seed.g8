ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / version := "0.0.1-SNAPSHOT"

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:_",
  "-unchecked",
  "-Xfatal-warnings"
)

ThisBuild / wartremoverErrors ++= Warts.unsafe
