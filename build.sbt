name := "study-scala-sbt"
version := "1.0"
scalaVersion := "2.11.5"

libraryDependencies += "junit" % "junit" % "4.12" % "test"

// [211]java�R�}���h�Ŏ��s�\��jar�t�@�C������邽�߂̏��ݒ�
Seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

// [212]���ˑ��̐ݒ�t�@�C�����r���h���ɏ��������邽�߂̏��ݒ�
import FilterKeys._
Seq(filterSettings: _*)
// xsbt-filter�̒u���ΏۂɃe�L�X�g�t�@�C����ǉ�
includeFilter in (Compile, filterResources) ~= { f => f || ("*.txt") }
// �J�����̐ݒ�
filterDirectoryName := "filters/develop"
// �^�p���̐ݒ�
// filterDirectoryName := "filters/production"

// [213]�e�X�g�̃J�o���b�W�𑪒肷�邽�߂̐ݒ�
import de.johoop.jacoco4sbt._
import jacocoPlugin._
Seq(jacoco.settings : _*)
