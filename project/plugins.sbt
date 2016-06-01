logLevel := Level.Warn

// [211]java�R�}���h�Ŏ��s�\��jar�t�@�C������邽�߂̃v���O�C��
resolvers += Resolver.url(
  "sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
)(Resolver.ivyStylePatterns)
addSbtPlugin("com.github.retronym" % "sbt-onejar" % "0.7")

// [212]���ˑ��̐ݒ�t�@�C�����r���h���ɏ��������邽�߂̃v���O�C��
resolvers ++= Seq(
  "sdb@github" at "http://sdb.github.com/maven"
)
addSbtPlugin("com.github.sdb" % "xsbt-filter" % "0.4")

// [213]�e�X�g�̃J�o���b�W�𑪒肷�邽�߂̃v���O�C��
//libraryDependencies ++= Seq(
//  "org.jacoco" % "org.jacoco.core" % "0.7.6.201602180812"
//  artifacts(Artifact("org.jacoco.core", "jar", "jar")),
//  "org.jacoco" % "org.jacoco.report" % "0.7.6.201602180812"
//  artifacts(Artifact("org.jacoco.report", "jar", "jar"))
//)
addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")

// [214]Web�A�v���P�[�V�������J�����邽�߂̃v���O�C��
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "2.0.5")
