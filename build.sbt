name := "study-scala-sbt"
version := "1.0"
scalaVersion := "2.11.5"

import FilterKeys._

libraryDependencies += "junit" % "junit" % "4.12" % "test"

Seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)
Seq(filterSettings: _*)

// xsbt-filterの置換対象にテキストファイルを追加
includeFilter in (Compile, filterResources) ~= { f => f || ("*.txt") }

// 開発時の設定
filterDirectoryName := "filters/develop"

// 運用時の設定
// filterDirectoryName := "filters/production"
