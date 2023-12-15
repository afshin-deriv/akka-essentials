name := "akka-essentials"
organization := "com.afshinpaydar"

version := "1.0"
scalaVersion := "2.12.7"
val akkaVersion = "2.5.13"
val scalaTestVersion = "3.0.5"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.3.0",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion,
)




