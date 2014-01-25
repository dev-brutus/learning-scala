package lesson03


/**
 *
 */

class E05Parallel(t: Traversable[Int], parallel: Boolean) {
  var sum = 0

  val coll = if (parallel) t.par else t

  coll.foreach(x => {
    sum = sum + x
  })
}

object E05Parallel extends App {
  val seq = new E05Parallel(1 to 1000, false)
  val par = new E05Parallel(1 to 1000, true)

  println(s"Sequence: ${seq.sum}")
  println(s"Parallel: ${par.sum}")

}
