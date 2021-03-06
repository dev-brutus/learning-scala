package lesson01

/**
 *
 */

object E06Constructors extends App {

  // Первичный конструктор
  class Vector2D(x: Double, y: Double) {
    println(s"Primary constructor $x; $y")

    // Дополнительный конструктор
    def this(coordinates: (Double, Double)) = {
      this(coordinates._1, coordinates._2)
      println(s"Auxiliary constructor $coordinates")
    }

    lazy val length = {
      println("Calculating length")
      Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))
    }

    override def toString: String = s"Vector($x, $y)"
  }

  println("Step1")
  val (x, y) = (4, 3)
  val vector1: Vector2D = new Vector2D(x, y)
  println(s"Length of $vector1 is ${vector1.length}")
  println()

  println("Step2")
  val coordinates: (Double, Double) = (2, 8)
  val vector2: Vector2D = new Vector2D(coordinates)
  println(s"Vector $coordinates is created: $vector2")
}
