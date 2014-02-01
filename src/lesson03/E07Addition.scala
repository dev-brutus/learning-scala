package lesson03

/**
 *
 */
object E07Addition extends App {
  val origin = List(7, 13, 17)

  val originWithSingleElement = origin :+ 0
  println(s"Origin wit single element: $originWithSingleElement")

  private val originWithManyElements = origin ++ List(1, 2, 4, 8)
  println(s"Origin wit many elements: $originWithManyElements")

}
