logLevel := Level.Warn

resolvers += Resolver.url(
  "sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
)(Resolver.ivyStylePatterns)

resolvers ++= Seq(
  "sdb@github" at "http://sdb.github.com/maven"
)

addSbtPlugin("com.github.retronym" % "sbt-onejar" % "0.7")
addSbtPlugin("com.github.sdb" % "xsbt-filter" % "0.4")
