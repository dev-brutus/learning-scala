package lesson02

/**
 *
 */
object E01Immutable extends App {
  val original: List[String] = List("Hello", "world")
  val upperOriginal = original.map(_.toUpperCase)
  println(upperOriginal)
  println()

  val evenNumbers = (1 to 20).filter(0 == _ % 2).map(n => s"Hello Mr. $n")
  println(evenNumbers)

  val evenNumbersWithSmth = evenNumbers.updated(0, "Foo")
  println(evenNumbersWithSmth)
  println(s"Is equals? ${evenNumbers == evenNumbersWithSmth}")
  println()
}
