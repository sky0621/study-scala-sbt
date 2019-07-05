package temp

object m01 extends App {

  def loopFrom0To9(): Unit = {
    var i = 0
    do {
      println(i)
      i+=1
    } while(i < 10)
  }

  println(loopFrom0To9())
}
