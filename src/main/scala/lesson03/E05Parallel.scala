package lesson03

import scala.collection.GenTraversable

/**
 *
 */

class E05Parallel(t: GenTraversable[Int]) {
  var sum = 0

  t.foreach(x => {
    sum = sum + x
  })
}

object E05Parallel extends App {
  val iterations = 1 to 1000

  println(s"Sequence: ${new E05Parallel(iterations).sum}")
  println(s"Parallel: ${new E05Parallel(iterations.par).sum}")

}
