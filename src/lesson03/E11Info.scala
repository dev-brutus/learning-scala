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

  println("=== containsSlice ===")
  val containsTailCall = origin.containsSlice(Array("tail", "call"))
  val containsTailCallTo = origin.containsSlice(Array("tail", "call", "to"))
  println(s"Contains `tail call':    $containsTailCall")
  println(s"Contains `tail call to': $containsTailCallTo")
  println

  println("=== count, filter, forall ===")
  val twoCharsPredicate: String => Boolean = _.length == 2
  val count = origin.count(twoCharsPredicate)
  val filtered = origin.filter(twoCharsPredicate)
  // См. filterNot
  val forAllOrigin = origin.forall(twoCharsPredicate)
  val forAllFiltered = filtered.forall(twoCharsPredicate)
  println(s"Filtered: $filtered")
  println(s"Filtered size: ${filtered.length}; Count: $count")
  println(s"forAll by origin:   $forAllOrigin")
  println(s"forAll by filtered: $forAllFiltered")
  println

  println("=== startsWith, endsWith ===")
  val startsWith = origin.startsWith(Array("Scala", "provides"))
  val endsWith = origin.endsWith(Array("stack", "overflow", "problems."))
  println(s"StartsWith: $startsWith")
  println(s"EndsWith:   $endsWith")
  println

  println("=== exists, indexOf ===")

  def findFunction(collection: Seq[String], what: String): (Boolean, Int) = {
    collection.exists(_ == what) -> collection.indexOf(what)
  }

  val findYes = findFunction(origin, "Scala")
  val findNo = findFunction(origin, "13")
  println(s"Scala: $findYes")
  println(s"13:    $findNo")
  println

  println("=== max, min, product, sum ===")
  val numbers = Array(-2, -3, 10, 5)
  println(s"Numbers: ${numbers.mkString(", ")}")
  println(s"max: ${numbers.max}")
  println(s"min: ${numbers.min}")
  println(s"sum: ${numbers.sum}")
  println(s"prd: ${numbers.product}")
  println

  println("=== corresponds ===")
  val numbersStr = Array("-2", "-3", "10", "5")
  val isCorresponded = numbers.corresponds(numbersStr)(_.toString == _)
  println(s"isCorresponded: $isCorresponded")
  println

  println("=== segmentLength ===")
  val oPredicate: String => Boolean = _.contains("o")
  val segmentLength = origin.segmentLength(oPredicate, 10)
  println(s"The longest sequence of words with letter `o' is: $segmentLength")
  println(origin.zipWithIndex.map(s => (s._2, oPredicate(s._1), s._1)))
  println

  // hasDefiniteSize, isTraversableAgain
  // isEmpty, nonEmpty
}
