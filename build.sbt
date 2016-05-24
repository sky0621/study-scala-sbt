name := "study-scala-sbt"
version := "1.0"
scalaVersion := "2.11.5"

import FilterKeys._

libraryDependencies += "junit" % "junit" % "4.12" % "test"

Seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)
Seq(filterSettings: _*)

// xsbt-filter�̒u���ΏۂɃe�L�X�g�t�@�C����ǉ�
includeFilter in (Compile, filterResources) ~= { f => f || ("*.txt") }

// �J�����̐ݒ�
filterDirectoryName := "filters/develop"

// �^�p���̐ݒ�
// filterDirectoryName := "filters/production"
