package lesson01

/**
 *
 */

abstract class Expression {
}

case class Num(n: Double) extends Expression {
  override def toString: String = n.toString
}

case class Add(a1: Expression, a2: Expression) extends Expression {
  override def toString: String = s"($a1 + $a2)"
}

case class Sub(a1: Expression, a2: Expression) extends Expression {
  override def toString: String = s"($a1 - $a2)"
}

object E09Calculator extends App {

  def evaluate(e: Expression): Double = {
    e match {
      case Num(n) => n
      case Add(a1, a2) => evaluate(a1) + evaluate(a2)
      case Sub(a1, a2) => evaluate(a1) - evaluate(a2)
    }
  }

  val e = Sub(Add(Num(3), Num(5)), Add(Num(-1), Num(18)))

  println(s"$e = ${evaluate(e)}")
}
