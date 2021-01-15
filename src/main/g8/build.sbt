ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / version := "0.0.1-SNAPSHOT"

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:_",
  "-unchecked"
  // "-Xfatal-warnings" // TODO: only apply if inside CI
)

/**
  * Ignored warts:
  * - DefaultArguments
  * - Equals // requires more work
  * - FinalVal
  * - ImplicitConversion
  * - ImplicitParameter
  * - JavaSerializable
  * - LeakingSealed
  * - MutableDataStructures
  * - Nothing
  * - Null
  * - Overloading
  * - Throw
  * - ToString
  * - Var
  * - While
  */

ThisBuild / wartremoverErrors ++= Seq(
  Wart.ArrayEquals,
  Wart.PublicInference,
  Wart.ExplicitImplicitTypes,
  Wart.FinalCaseClass,
  Wart.JavaConversions,
  Wart.Return,
)

ThisBuild / wartremoverWarnings ++= Seq(
  Wart.NonUnitStatements,
  Wart.StringPlusAny,
  Wart.Any,
  Wart.AnyVal,
  Wart.AsInstanceOf,
  Wart.IsInstanceOf,
  Wart.EitherProjectionPartial,
  Wart.Enumeration,
  Wart.OptionPartial,
  Wart.Option2Iterable,
  Wart.Product,
  Wart.Recursion,
  Wart.Serializable,
  Wart.TraversableOps,
  Wart.TryPartial,
)

