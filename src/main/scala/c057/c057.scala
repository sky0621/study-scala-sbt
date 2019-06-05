package c057

object c057 extends App {
  def multi(times: Int) = (i: Int) => i * times

  val m5 = multi(5)
  println(m5(3))
}

