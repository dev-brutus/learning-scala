package lesson03

/**
 *
 */
object E01Functions extends App {
  val f: Int => Int = x => {
    x * 2
  }

  println(s"f(3) = ${f(3)}")
  println(s"f(5) = ${f(5)}")

  // Функтор
  def g(fx: (Int => Int), k: Int): Int => Int = {
    fx(_) - k
  }

  val gf5: (Int) => Int = g(f, 5)

  println(s"G(f, 5) = $gf5")
  println(s"G(f, 5)(8) = ${gf5(8)}")
}
