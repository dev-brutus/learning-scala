/**
 *
 */
package object lesson03 {
  type Num = lesson01.Num

  implicit def doubleToNum(d: Double): Num = lesson01.Num(d)
}
