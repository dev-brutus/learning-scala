package lesson03

/**
 *
 */
object E0XMethods extends App{

  val s: Seq[Num] = List(4,7,42)

  s.companion

  private val builder: StringBuilder = new StringBuilder()

  s.addString(builder, "Numbers: ", ", ", ";")

  println(builder)

}
