package lesson01

/**
 *
 */
object E13Exceptions extends App {
  def thrower = throw new Exception

  try {
    thrower
  } catch {
    case r: Exception => println("Hello, " + r)
  }
}
