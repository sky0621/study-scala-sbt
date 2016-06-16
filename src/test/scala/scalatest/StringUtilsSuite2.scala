package scalatest

import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by SS on 2016/06/16.
  */
class StringUtilsSuite2 extends FunSuite with BeforeAndAfter {

  before {
    println("** before **")
  }

  test("StringUtils#isEmpty returns true for null") {
    assert(StringUtils.isEmpty(null))
  }

  test("StringUtils#isEmpty returns true for the empty string") {
    assert(StringUtils.isEmpty(""))
  }

  test("StringUtils#isEmpty returns falsetrue for any other string") {
    assert(!StringUtils.isEmpty("a"))
  }

  after {
    println("** after **")
  }
}
