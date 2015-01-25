package lesson01

import java.text.SimpleDateFormat
import java.util.Date

/**
 *
 */
class E05Fields {

  // значение с автоматическим вычислением типа
  val time = new Date()
  // переменная с явным указанием типа
  var format: String = null

  // метод состоит из одного выражения, так что скобки {} можно не писать
  override def toString: String =
  // if это тоже выражение
  if (null == format) time.toString
  else new SimpleDateFormat(format).format(time)
}

object E05Fields extends App {
  val now = new E05Fields
  println("Default format: " + now)
  now.format = "YYYY-MM-DD'T'HH:mm:ssZ"
  // now.time = <smth> писать нельзя
  println("ISO format:     " + now)
}
