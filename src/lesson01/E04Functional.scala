package lesson01

/**
 *
 */
object E04Functional extends App {
  val a = 3
  val b = 5

  val f = (x: Int) => {
    x * 2
  }

  val g: (Int) => Int = _ * 3
  println(s"f(a) = ${f(a)}; where f = $f and a = $a")
  println(s"g(b) = ${g(b)}; where g = $g and b = $b")
}
