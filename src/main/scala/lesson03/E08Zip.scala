package lesson03

/**
 *
 */
object E08Zip extends App {
  val listA: IndexedSeq[String] = "The name Scala is a portmanteau of \"scalable\" and \"language\", signifying that it is designed to grow with the demands of its users."
  val listB = -23 to 0
  println(s"List A: $listA")
  println(s"List B: $listB")
  println

  val zipped = listA.zip(listB)
  val unzipped = zipped.unzip
  val (unzippedA, unzippedB) = unzipped

  println(s"Zipped:    $zipped")
  println(s"Unzipped:  $unzipped")
  println(s"UnzippedA: $unzippedA")
  println(s"UnzippedB: $unzippedB")


}
