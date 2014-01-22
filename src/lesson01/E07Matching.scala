package lesson01

/**
 *
 */
object E07Matching extends App {
  val optionsCount = args.size match {
    case 0 => "No options"
    case 1 => "One option"
    case 2 => "Two options"
    case 3 => "Three options"
    case _ => "Many options"
  }

  println(optionsCount)

  val optionArgs: Option[String] = args match {
    case _ if args.isEmpty => None
    case _ => Some(args.mkString(" "))
  }

  println(optionArgs)

  val result = optionArgs match {
    case None => "Nothing to do"
    case Some("Hello") => "Hello!"
    case Some("Bye") => "Good bye!"
    case _ => null
  }

  println(result)
}
