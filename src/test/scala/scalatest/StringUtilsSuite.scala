package scalatest

import org.scalatest.FunSuite

/**
  * Created by SS on 2016/06/08.
  */
class StringUtilsSuite extends FunSuite {

  test("StringUtils#isEmpty returns true for null") {
    assert(StringUtils.isEmpty(null))
  }

  test("StringUtils#isEmpty returns true for the empty string") {
    assert(StringUtils.isEmpty(""))
  }

  test("StringUtils#isEmpty returns falsetrue for any other string") {
    assert(!StringUtils.isEmpty("a"))
  }

}
