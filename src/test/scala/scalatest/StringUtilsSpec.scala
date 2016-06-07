package scalatest

import org.scalatest.FunSpec

/**
  * Created by SS on 2016/06/08.
  */
class StringUtilsSpec extends FunSpec {

  describe("StringUtils#isEmpty") {

    it("returns true for null") {
      assert(StringUtils.isEmpty(null))
    }

    it("returns true for empty string") {
      assert(StringUtils.isEmpty(""))
    }

    it("returns true for any other string") {
      assert(!StringUtils.isEmpty("a"))
    }

  }
}
