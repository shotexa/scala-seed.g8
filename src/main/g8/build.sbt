ThisBuild / organization := "com.shotexa"
ThisBuild / scalaVersion := "2.13.4"
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
    name := "scala2-seed", // change this
    libraryDependencies ++= dependencies
  )


lazy val dependencies = coreDependencies ++ testDependencies

lazy val coreDependencies = Seq(
    // custom core dependencies
) ++ Dependencies.core
lazy val testDependencies = Seq(
    // custom test dependencies
) ++ Dependencies.test.map(_ % Test)




// Generate from template: <github link>