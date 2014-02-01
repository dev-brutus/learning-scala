package lesson03

/**
 *
 */
object E10Extraction extends App {
  val origin: IndexedSeq[String] = "Instead of the pseudo-type void, Scala has the actual singleton class Unit"

  println(s"The 2nd element is \"${origin(2)}\"")
  println(s"This condition is always ${origin(3) == origin.apply(3)}")

  // apply
  // copyToArray
  // copyToBuffer
  // diff
  // distinct
  // drop, dropRight, dropWhile
  // head, headOption, tail
  // intersect
  // padTo
  // partition
  // slice
  // sliding
  // span
  // splitAt
  // take
}
