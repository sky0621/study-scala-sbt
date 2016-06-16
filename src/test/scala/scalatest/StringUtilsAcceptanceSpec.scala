package scalatest

import org.specs2.Specification

/**
  * Created by SS on 2016/06/17.
  */
class StringUtilsAcceptanceSpec extends Specification { def is =

  "This is a specification for StringUtils#isEmpty" ^
                                                            p^
  "StringUtils#isEmpty returns"                        ^
    "true for null"                                      ! e1^
    "true for the empty string"                        ! e2^
    "false for any other strings"                      ! e3^
                                                           end
  def e1 = StringUtils.isEmpty(null) must beTrue
  def e2 = StringUtils.isEmpty("") must beTrue
  def e3 = StringUtils.isEmpty("a") must beFalse
}
