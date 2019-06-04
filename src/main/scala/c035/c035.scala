package c035

object c035 extends App {
  for (i <- 1 to 20) {
    println(i)
  }

  for (i <- 1 to(10, 3)) {
    printf("%d, ", i)
  }
}
