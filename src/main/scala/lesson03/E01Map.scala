package lesson03

/**
 *
 */
object E01Map extends App {
  val original: Seq[String] = List("Hello", "world")
  val upperOriginal = original.map(item => item.toUpperCase)
  println(upperOriginal)
}
