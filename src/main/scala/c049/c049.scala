package c049

object c049 extends App {
  val f1: String => Unit = {
    _ match {
      case "Scala" => println("SCALA!!!")
      case _ => println("NOT SCALA")
    }
  }

  f1("Scala")
  f1("scala")
  f1("Java")

  val f2: String => Unit = {
    case "Java" => println("JAVA!!!!!!")
    case _ => println("NOT JAVA")
  }

  f2("Scala")
  f2("Java")
  f2("java")
}
