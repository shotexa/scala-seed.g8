import Util._

lazy val `$name;format="norm"$` = project
  .in(file("."))
  .settings(
    name := "$name;format="norm"$"
  )
  .settings(dependencies)

lazy val dependencies = Seq(
  libraryDependencies ++= Seq(
    Dependencies.Core.com.lihaoyi.`os-lib`
  ),

  libraryDependencies ++= Seq(
    Dependencies.Test.org.scalatest.scalatest,
    Dependencies.Test.org.scalatestplus.`scalacheck-1-14`
  ).map(_ % Test)
)  
