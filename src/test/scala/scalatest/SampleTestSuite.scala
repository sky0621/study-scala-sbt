package scalatest

import org.scalatest.{FunSuite, MustMatchers}

/**
  * Created by SS on 2016/06/08.
  */
class SampleTestSuite extends FunSuite with MustMatchers {

  val list = List("a", "b")

  test("[SAMPLE] list size check WITH failure") {
    assert(list.nonEmpty)
    assert(list.isEmpty, "list is not empty!")
  }

  test("[SAMPLE] list size check WITH failure 2") {
    assert(list.size === 3)
  }

  test("[SAMPLE] expect check") {
    expect(55) {
      (1 to 10).foldLeft(0) { (a, b) => a + b }
    }
  }

  val opt = None
  test("[SAMPLE] throw Exception check") {
    intercept[NoSuchElementException] {
      val s = opt.get
    }
  }

  test("[SAMPLE] standard matchers") {
    1 must be === 1
    1 must be (1)
    1 must equal(1)

    2 must not be (1)
    2 must not equal(1)
  }

}
