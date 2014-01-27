package lesson03

/**
 *
 */


object E07 extends App {
  val a = List[Short](1, 4, 6, 9)

  def op(a: Short, b: Short): Short = {
    (a + b).asInstanceOf[Short]
  }

  println(a.companion)
}
