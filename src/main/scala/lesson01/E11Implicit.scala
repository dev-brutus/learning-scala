package lesson01

/**
 *
 */
object E11Implicit extends App {

  implicit val stringClass = classOf[String]

  def typeClass[T](implicit clazz: Class[T]) = {
    clazz.toString
  }

  println(typeClass[String])
}
