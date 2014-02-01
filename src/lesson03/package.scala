/**
 *
 */
package object lesson03 {
  type Num = lesson01.Num
  implicit def doubleToNum(d: Double): Num = lesson01.Num(d)

  private val SPLIT_REGEXP = ",? "

  implicit def stringToSeq(s: String): List[String] = s.split(SPLIT_REGEXP).toList
  implicit def stringToIndexedSeq(s: String): Vector[String] = s.split(SPLIT_REGEXP).toVector
}
