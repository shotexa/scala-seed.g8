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


lazy val root = (project in file(".")).
  settings(
    name := "$name;format="lower,word"$",
    libraryDependencies ++= dependencies
  )


lazy val dependencies = coreDependencies ++ testDependencies

lazy val coreDependencies = Seq(
    // custom core dependencies
) ++ Dependencies.core
lazy val testDependencies = Seq(
    // custom test dependencies
) ++ Dependencies.test.map(_ % Test)
