package lesson03

/**
 *
 */


object E07Fold extends App {
  val numbers = List(1, 4, 6, 9)

  type Accumulator = (Double, Int)

  def op(accumulator: Accumulator, item: Int) = {
    (accumulator._1 + item, accumulator._2 + 1)
  }

  private val avg: Accumulator = numbers.foldLeft(0.0, 0)(op)

  println(avg._1 / avg._2)
}
