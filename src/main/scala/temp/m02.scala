package temp

object m02 extends App {
  for (
    x <- 1 to 100;
    y <- 1 to 100;
    z <- 1 to 100;
    if x*x == y*y + z*z
  ) yield println(s"x=$x, y=$y, z=$z")

}
