name := "study-scala-sbt"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies += "junit" % "junit" % "4.12" % "test"

Seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)
