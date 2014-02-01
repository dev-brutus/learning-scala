package lesson03

/**
 *
 */
object E08Collect extends App {
  val origin = List("1", "7", "Foo", "18", "None")

  def isDefinedAt(x: String): Boolean = try {
    x.toDouble
    true
  } catch {
    case _: Throwable => false
  }

  val converter: PartialFunction[String, Double] = {
    case x if isDefinedAt(x) => x.toDouble
  }

  private val collected: List[Double] = origin.collect(converter)
  println(collected)
}
