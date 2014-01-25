package lesson02

/**
 *
 */
object E03Functor extends App {
  def f(x: Double) = {
    -x + 3
  }

  // Функтор
  def g(fx: (Double) => Double, c: Double): Double => Double = {
    fx(_) / c
  }

  val gf5: (Double) => Double = g(f, 5)

  println(s"G(f, 5) = $gf5")

  for (x <- 1 to 5) {
    println(s"G(f, 5)($x) = ${gf5(x)}")
  }
}
