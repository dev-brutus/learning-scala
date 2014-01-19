package lesson01

/**
 *
 */
class Vector2D(x: Double, y: Double) {

  def this(coordinates: (Double, Double)) = {
    this(coordinates._1, coordinates._2)
  }

  lazy val length = {
    println("Calculating length")
    Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))
  }

  override def toString: String = s"Vector($x, $y)"
}

object Vector2D extends App {
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