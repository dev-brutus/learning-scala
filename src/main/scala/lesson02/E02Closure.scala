package lesson02

/**
 *
 */
object E02Closure extends App {

  def f(k: Double, c: Double) = {
    x: Double => k * x + c
  }

  val f25 = f(2, -5) // y = 2x - 5

  for (x <- 1 to 5) {
    println(s"$x: ${f25(x)}")
  }
}
