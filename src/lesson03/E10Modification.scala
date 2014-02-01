package lesson03

/**
 *
 */
object E10Modification extends App {
  val origin: IndexedSeq[String] = "In Scala all types inherit from a top-level class Any."

  println("=== sliding ===")
  val slided = origin.sliding(5).toList
  println(s"Slided:  $slided")
  println

  println("=== flatten, flattenMap ===")
  private val f: String => Seq[Int] = s => {
    new StringBuilder(s).map(c => c.toInt)
  }
  val mapped = origin.map(f)
  val flattened = mapped.flatten
  val flatMapped = origin.flatMap(f)

  println(s"Mapped:     $mapped")
  println(s"Flattened:  $flattened")
  println(s"FlatMapped: $flatMapped")
  println


  // groupBy
  // grouped
  // mkString
  // reverse
  // sorted, sortBy, sortWith
}
