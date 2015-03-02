package lesson03

/**
 *
 */
object E09Union extends App {
  val origin = List(7, 13, 17)

  println("=== :+ ===")
  val originWithSingleElement = origin :+ 0
  println(s"Origin wit single element: $originWithSingleElement")
  println

  println("=== +: ===")
  val originWithOtherElement = 5 +: origin
  println(s"Origin wit single element: $originWithOtherElement")
  println

  println("=== ++ ===")
  val originWithManyElements = origin ++ List(1, 2, 4, 8)
  println(s"Origin wit many elements: $originWithManyElements")
  println

  println("=== union ===")
  val union = origin.union(1 to 5)
  println(s"Union: $union")
  println

  println("=== patch ===")
  val patchedUnion = union.patch(3, Array(100, 101, 102), 2)
  println(s"Patched union: $patchedUnion")
  println

  println("=== padTo ===")
  val padded = origin.padTo(7, -1)
  println(s"Padded: $padded; The length is: ${padded.length}")
  println
}
