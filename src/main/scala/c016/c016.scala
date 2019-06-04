package c016

object c016 extends App {
  lazy val y = i + 2
  val x = i * 2
  var i = 1

  i = 2

  println(x)
  println(y)

  i = 3

  println(y)
}
