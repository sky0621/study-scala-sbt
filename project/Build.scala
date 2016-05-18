import sbt._
import Keys._

object MyProject extends Build {

  lazy val root = Project("study-scala-sbt", file(".")).aggregate(subPjCommon, subPjBackWeb, subPjFrontWeb)

  lazy val subPjCommon = Project("sub_pj_common", file("sub_pj_common"))

  lazy val subPjFrontWeb = Project("sub_pj_front_web", file("sub_pj_front_web")).dependsOn(subPjCommon)

  lazy val subPjBackWeb = Project("sub_pj_back_web", file("sub_pj_back_web")).dependsOn(subPjCommon)

}