package lesson01

/**
 *
 */
object E13Option extends App {
  def describeValue(value: Option[_]): String = {
    value match {
      case None => "No value"
      case Some(s: String) => s"String: $s"
      case Some(i: Int) => s"Int: $i"
      case Some(l: Long) => s"Long: $l"
      case Some(v) => s"Value: $v"
    }
  }

  Seq(
    Option(null),
    None,
    Option(404),
    Some(42L),
    Some("Foo"),
    Some(),
    Some(classOf[App])
  ) foreach (f => println(s"$f -> ${describeValue(f)}"))
}
