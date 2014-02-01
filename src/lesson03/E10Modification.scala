package lesson03

/**
 *
 */
object E10Modification extends App {
  val origin: IndexedSeq[String] = "In Scala all types inherit from a top-level class Any."

  println(s"Origin: $origin")
  println

  println("=== reverse ===")
  println(s"Reverse order: ${origin.reverse}")
  println

  println("=== sorted ===")
  println(s"Sorted order: ${origin.sorted}") // См. sortBy, sortWith
  println

  println("=== sliding, groupBy ===")
  val slided = origin.sliding(5).toList
  val grouped = origin.grouped(5).toList
  println(s"Slided:  $slided")
  println(s"Grouped: $grouped")
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

  println("=== groupBy ===")
  val groupedByLength = origin.groupBy(_.length)
  println(s"Grouped by length: $groupedByLength")
  println

  println("=== mkString, addString ===")
  private val numbers = groupedByLength.keys
  val numbersSimple = numbers.mkString(" ^ ")
  val numbersComplex = numbers.addString(new StringBuilder, "Numbers (complex): ", " ^ ", ";")
  println(s"Numbers (simple):  $numbersSimple;")
  println(numbersComplex)
  println

}
