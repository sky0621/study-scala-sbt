package c063

import scala.annotation.tailrec

object c063 extends App {
  val l = List(1, 2, 3, 4, 5)

  @tailrec
  def sum(total: Int, list: List[Int]): Int = {
    if (list.isEmpty) {
      return total
    }
    return sum(total + list.head, list.tail)
  }

  println(sum(0, l))
}

