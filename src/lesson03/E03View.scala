package lesson03

/**
 *
 */
object E03View extends App {
  val numbers = (1 to 20).view
  println(s"Numbers: $numbers")

  val evenNumbers = numbers.filter(0 == _ % 2)
  println(s"evenNumbers: $evenNumbers")

  val mappedEvenNumbers = evenNumbers.map(n => s"Hello, Mr. $n")
  println(s"mappedEvenNumbers: $mappedEvenNumbers")

  println(s"FORCE: ${mappedEvenNumbers.force}")
}
