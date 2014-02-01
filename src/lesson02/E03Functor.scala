package lesson02

/**
 *
 */
object E03Functor extends App {

  type MyFunction = (Double) => Double

  def f(x: Double) = {
    -x + 3
  }

  // Функтор
  def g(fx: MyFunction, c: Double): MyFunction = {
    fx(_) / c
  }

  val gf5: MyFunction = g(f, 5)

  println(s"G(f, 5) = $gf5")

  for (x <- 1 to 5) {
    println(s"G(f, 5)($x) = ${gf5(x)}")
  }
}
