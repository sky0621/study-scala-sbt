logLevel := Level.Warn

// [211]javaコマンドで実行可能なjarファイルを作るためのプラグイン
resolvers += Resolver.url(
  "sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
)(Resolver.ivyStylePatterns)
addSbtPlugin("com.github.retronym" % "sbt-onejar" % "0.7")

// [212]環境依存の設定ファイルをビルド時に書き換えるためのプラグイン
resolvers ++= Seq(
  "sdb@github" at "http://sdb.github.com/maven"
)
addSbtPlugin("com.github.sdb" % "xsbt-filter" % "0.4")

// [213]テストのカバレッジを測定するためのプラグイン
//libraryDependencies ++= Seq(
//  "org.jacoco" % "org.jacoco.core" % "0.7.6.201602180812"
//  artifacts(Artifact("org.jacoco.core", "jar", "jar")),
//  "org.jacoco" % "org.jacoco.report" % "0.7.6.201602180812"
//  artifacts(Artifact("org.jacoco.report", "jar", "jar"))
//)
addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")

// [214]Webアプリケーションを開発するためのプラグイン
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "2.0.5")
