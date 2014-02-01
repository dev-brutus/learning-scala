package lesson01

/**
 *
 */

object E07Traits extends App {

  trait Comparable[A] {
    def <(that: Comparable[A]): Boolean

    val value: A

    def >(that: Comparable[A]): Boolean = {
      that < this
    }

    def <=(that: Comparable[A]): Boolean = {
      !(this > that)
    }

    def >=(that: Comparable[A]): Boolean = {
      !(this < that)
    }

    def ==(that: Comparable[A]): Boolean = {
      (this <= that) && (this >= that)
    }

    def !=(that: Comparable[A]): Boolean = {
      (this < that) || (this > that)
    }
  }

  class Holder(val value: Int) extends Comparable[Int] {
    def <(that: Comparable[Int]): Boolean = value < that.value

    override def toString: String = value.toString
  }

  // На самом деле в Scala нет цикла for. Это всё сахар.
  for (numbers <- (1 to 4).combinations(2)) {
    for (numbers <- numbers.permutations) {
      val x = new Holder(numbers(0))
      val y = new Holder(numbers(1))

      print(s"$x > $y: ${x > y}; ")
      print(s"$x < $y: ${x < y}; ")
      println()
    }
  }
}
