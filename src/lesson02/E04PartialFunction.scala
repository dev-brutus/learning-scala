package lesson02

/**
 *
 */
object E04PartialFunction extends App {

  val stringToDouble: PartialFunction[String, Double] = {
    case s if s.matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$") => s.toDouble
  }

  val doubles: List[Double] = List("1.2", "Foo", "-1.3E+5", "Bar", "42").
    filter(stringToDouble.isDefinedAt).
    map(stringToDouble)

  println(doubles)

}
