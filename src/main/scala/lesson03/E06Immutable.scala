package lesson03

/**
 *
 */
object E06Immutable extends App {
  val originalVector = (1 to 10).toVector

  val modifiedVector = originalVector.updated(0, -1)

  println(s"original: $originalVector")
  println(s"modified: $modifiedVector")
}
