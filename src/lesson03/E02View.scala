package lesson03

/**
 *
 */
object E02View extends App {
  val evenNumbers = (1 to 20).filter(0 == _ % 2).map(n => s"Hello, Mr. $n")
  val evenNumbersView = (1 to 20).view.filter(0 == _ % 2).map(n => s"Hello, Mr. $n")

  println(evenNumbers)
  println(evenNumbersView)
  println(evenNumbersView.force)
}
