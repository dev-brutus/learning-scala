/**
 *
 */
package object lesson03 {
  private val SPLIT_REGEXP = ",? "

  implicit def stringToSeq(s: String): List[String] = s.split(SPLIT_REGEXP).toList

  implicit def stringToIndexedSeq(s: String): Vector[String] = s.split(SPLIT_REGEXP).toVector
}
