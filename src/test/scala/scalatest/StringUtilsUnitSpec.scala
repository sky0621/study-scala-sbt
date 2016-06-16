package scalatest

import org.specs2.mutable.Specification

/**
  * Created by SS on 2016/06/17.
  */
class StringUtilsUnitSpec extends Specification {

  "StringUtils#isEmpty" should {
    "return true for null" in {
      StringUtils.isEmpty(null) must beTrue
    }

    "return true for the empty string" in {
      StringUtils.isEmpty("") must beTrue
    }

    "return false for any other strings" in {
      StringUtils.isEmpty("a") must beFalse
    }
  }
}
