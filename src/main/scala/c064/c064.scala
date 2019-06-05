package c064

object c064 extends App {
  val o = new Outer
  val i = new o.Inner
  val o2 = new Outer
  val i2 = new o2.Inner

  o.po = 345
  println(o.po)
  println(o.get())
  println(i.pi)
  println(i.get)
}

class Outer {
  var po = 0
  def get() = po

  class Inner {
    var pi = -1
    def get = pi
  }

}
