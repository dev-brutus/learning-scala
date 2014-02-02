package lesson02

/**
 *
 */
object E01Functions extends App {
  val f: (Int => Int) = x => {
    x * 2
  }

  for (x <- 1 to 5) {
    println(s"f($x) = ${f(x)}")
  }
}
