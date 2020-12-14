import Util._

// Aggregator
lazy val `$name;format="norm"$` = project
  .in(file("."))
  .settings(
    name := "$name;format="norm"$"
  )
  .aggregate(main, util)

lazy val main = project
  .in(file("./main"))
  .settings(
    libraryDependencies ++= Seq(
        // Custom project dependencies goes here.
    )
  )
  .dependsOn(util % cctt)


lazy val util = project
  .settings(
    libraryDependencies ++= baseDependencies
  )
  .in(file("./util"))

lazy val coreDependencies = Seq(
  Dependencies.Core.com.lihaoyi.`os-lib`
)

lazy val testDependencies = Seq(
  Dependencies.Test.org.scalatest.scalatest,
  Dependencies.Test.org.scalacheck.scalacheck,
  Dependencies.Test.org.scalatestplus.`scalacheck-1-14`
).map(_ % Test)

lazy val baseDependencies = coreDependencies ++ testDependencies