package lesson02

/**
 *
 */
object E04PartialFunction extends App {

  val stringToDouble: PartialFunction[String, Double] = {
    case s if s.matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$") => s.toDouble
  }

  val origin = List("1.2", "Foo", "-1.3E+5", "Bar", "42")

  val doubles: List[Double] =
    for (s <- origin if stringToDouble.isDefinedAt(s)) yield stringToDouble(s)

  println(doubles)
}
