package c053

object c053 extends App {
  val f = (i: Int) => i * 2
  println(f(3))

  val f2: Int => Int = i => i * 3
  println(f2(3))

  val f3: Int => Int = _ * 4
  println(f3(5))

  val f4 = (_: Int) * 5
  println(f4(9))

  val f5 = ((_: Int) * 6).andThen(println)
  f5(12)
}
