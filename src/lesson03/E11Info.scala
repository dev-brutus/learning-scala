package lesson03

/**
 *
 */
object E11Info extends App {
  val origin: IndexedSeq[String] = "Scala provides tail call optimization to allow for extensive use of recursion without stack overflow problems."

  println("=== contains ===")
  val containsScala = origin.contains("Scala")
  val containsText = origin.contains("Text")
  println(s"Contains `Scala': $containsScala")
  println(s"Contains `Text': $containsText")
  println

  // containsSlice
  // sameElements
  // corresponds
  // count
  // endsWith
  // exists
  // find
  // forall
  // hasDefiniteSize, isTraversableAgain
  // indexOf
  // isEmpty, nonEmpty
  // lift
  // max, min
  // product, sum
  // segmentLength
  // startsWith
}
