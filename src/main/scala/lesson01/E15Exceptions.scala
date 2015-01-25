package lesson01

/**
 *
 */
object E15Exceptions extends App {
  def thrower = throw new Exception

  try {
    thrower
  } catch {
    case r: Exception => println("Hello, " + r)
  }
}
