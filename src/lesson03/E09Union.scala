package lesson03

/**
 *
 */
object E09Union extends App {
  val origin = List(7, 13, 17)

  val originWithSingleElement = origin :+ 0
  println(s"Origin wit single element: $originWithSingleElement")

  val originWithManyElements = origin ++ List(1, 2, 4, 8)
  println(s"Origin wit many elements: $originWithManyElements")

  val union = origin.union(1 to 5)
  println(s"Union: $union")

  val patchedUnion = union.patch(3, Array(100, 101, 102), 2)
  println(s"Patched union: $patchedUnion")

  println
  println("==== ZIP ====")

  val zip: List[(Int, Int)] = patchedUnion.zip(originWithManyElements)
  println(s"zip: $zip")

  println(s"Unzip: ${zip.unzip}")
}
