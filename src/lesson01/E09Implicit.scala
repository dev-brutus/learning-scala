package lesson01

/**
 *
 */

object E09Implicit extends App {

  implicit def doubleToNum(d: Double): Num = Num(d)

  def evaluate(e: Expression): Double = {
    e match {
      case Num(n) => n
      case Add(a1, a2) => evaluate(a1) + evaluate(a2)
      case Sub(a1, a2) => evaluate(a1) - evaluate(a2)
    }
  }

  val e = Sub(Add(3, 5), Add(-1, 18))

  println(s"$e = ${evaluate(e)}")
}
