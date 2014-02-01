package lesson03

/**
 *
 */
object E0XMethods extends App{

  val s: Seq[Num] = List(4,7,42)

  println(s.companion(1,2,3))

  private val builder: StringBuilder = new StringBuilder()
  s.addString(builder, "Numbers: ", ", ", ";")
  println(builder)

//  s.compose()
//
//  s.andThen()

}
