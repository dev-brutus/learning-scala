package lesson03


/**
 *
 */
object E04Tuple extends App {
  private val indexedPersons: List[(String, Int)] = List("Alice", "Bob", "Charlie").zipWithIndex
  println(indexedPersons)
  println()

  def createUserInfo(tuple: (String, Int)) = {
    val (name, index) = tuple
    val preparedName = name.toLowerCase.replaceAll("[^a-z0-9_]", "")
    (name, s"$preparedName@example.com", index + 1)
  }

  indexedPersons.map(createUserInfo).foreach(s => {
    println(s"#${s._3}. Email ${s._2} is created for user ${s._1}")
  })
}
