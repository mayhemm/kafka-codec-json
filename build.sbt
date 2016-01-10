name := """kafka-json-codec"""

version := "1.0"

organization := "org.mayhem"

scalaVersion := "2.10.6"

crossScalaVersions := Seq("2.10.6", "2.11.7")

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-native" % "3.3.0",
  "org.apache.kafka" %% "kafka" % "0.8.2.2"
)

