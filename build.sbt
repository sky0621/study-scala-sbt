name := "study-scala-sbt"
version := "1.0"
scalaVersion := "2.11.5"

libraryDependencies += "junit" % "junit" % "4.12" % "test"

// [211]javaコマンドで実行可能なjarファイルを作るための諸設定
Seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

// [212]環境依存の設定ファイルをビルド時に書き換えるための諸設定
import FilterKeys._
Seq(filterSettings: _*)
// xsbt-filterの置換対象にテキストファイルを追加
includeFilter in (Compile, filterResources) ~= { f => f || ("*.txt") }
// 開発時の設定
filterDirectoryName := "filters/develop"
// 運用時の設定
// filterDirectoryName := "filters/production"

// [213]テストのカバレッジを測定するための設定
import de.johoop.jacoco4sbt._
import jacocoPlugin._
Seq(jacoco.settings : _*)
