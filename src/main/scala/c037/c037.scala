package c037

object c037 extends App {
  val pgs = List("Java", "Scala", "Go", "C", "Ruby", "Python")
  val re = for (pg <- pgs if pg.contains("a")) yield pg.charAt(0)
  println(re)
}
