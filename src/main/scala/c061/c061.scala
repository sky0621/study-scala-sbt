package c061

object c061 extends App {
  val greetGreetFunc = (first: String) => (second: String) => (third: String) => println(first + ":" + second + ":" + third)
  greetGreetFunc("oNe")("tWO")("ThREe")

  val f = greetGreetFunc("FirsTTT")
  println(f)
  val f2 = f("seCONdddddddddd")
  f2("THirRrRrRrD")
}
