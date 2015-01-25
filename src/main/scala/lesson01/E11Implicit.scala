package lesson01

/**
 *
 */
object E11ImplicitA extends App {

  implicit val stringClass = classOf[String]
  implicit val intClass = classOf[Int]

  def typeClass[T](implicit clazz: Class[T]) = {
    clazz.toString
  }

  println(typeClass[String])
  println(typeClass[Int])
}

object E11ImplicitB extends App {

  implicit class StringDecorator(str: String) {
    def print() = println(str)
  }

  "Print string".print()
}