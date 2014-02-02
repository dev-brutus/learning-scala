
package lesson03

/**
 *
 */
object E10Extraction extends App {
  val origin: IndexedSeq[String] = "Instead of the pseudo-type void, Scala has the actual singleton class Unit"

  println(s"The 4th element is ${origin(4)}")
  println(s"This condition is always ${origin(3) == origin.apply(3)}")
  println

  println("=== lift ===")
  val lift = origin.lift
  for (n <- 9 until 14) {
    println(s"$n: ${lift(n)}")
  }
  println

  println("=== copyToArray ===")
  val buffer: Array[String] = Array.fill(4)("")
  origin.copyToArray(buffer, 2, 3) // См. copyToBuffer
  println(s"The copied array: ${buffer.toList}")
  println

  println("=== diff, intersect ===")
  private val strings = Array("Scala", "the")
  val diff = origin.diff(strings)
  val intersect = origin.intersect(strings)
  println(s"Origin:         $origin")
  println(s"Diff:           $diff")
  println(s"Intersection:   $intersect")
  println

  println("=== distinct ===")
  val distinct = origin.distinct
  println(s"Origin:   $origin")
  println(s"Distinct: $distinct")
  println

  println("=== drop ===")
  val dropped = origin.drop(5) // См. drop, dropRight, dropWhile
  println(s"Origin:  $origin")
  println(s"Dropped: $dropped")
  println

  println("=== head, tail ===")
  val head = origin.head
  // См. headOption
  val tail = origin.tail
  println(s"Origin:  $origin")
  println(s"Head: $head")
  println(s"Tail: $tail")
  println

  println("=== partition, span ===")
  private val isCapitalized: (String) => Boolean = s => {
    s.toLowerCase != s
  }
  val partitioned = origin.partition(isCapitalized)
  val spanned = origin.span(isCapitalized)
  println(s"Origin:      $origin")
  println(s"Partitioned: $partitioned")
  println(s"Spanned:     $spanned")
  println

  println("=== slice ===")
  val slice = origin.slice(2, 4)
  println(s"Origin: $origin")
  println(s"Slice:  $slice")
  println

  println("=== splitAt ===")
  val splitted = origin.splitAt(4)
  println(s"Origin:   $origin")
  println(s"Splitted: $splitted")
  println

  println("=== take ===")
  val taken = origin.take(4)
  println(s"Origin: $origin")
  println(s"Taken:  $taken")
  println


}
