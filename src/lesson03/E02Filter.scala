package lesson03


/**
 *
 */
object E02Filter extends App {
  val numbers: Seq[Int] = 1 to 20
  println(s"Numbers: $numbers")

  val evenNumbers = numbers.filter(0 == _ % 2)
  println(s"evenNumbers: $evenNumbers")

  val mappedEvenNumbers = evenNumbers.map(n => s"Hello, Mr. $n")
  println(s"mappedEvenNumbers: $mappedEvenNumbers")
}
