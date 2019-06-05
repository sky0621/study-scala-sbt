package c050

object c050 extends App {
  val o = Option("abc")
  println(o.get)
  println(o.orNull)

  val o2 = Option(null)
//  println(o2.get)
  println(o2.isDefined)
  println(o2.orNull)
}
