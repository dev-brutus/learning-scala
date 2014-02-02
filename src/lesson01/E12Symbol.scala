package lesson01

/**
 *
 */
object E12Symbol extends App {
  type Command = (Symbol, Int)

  class Machine {
    private val data = new Array[Int](255)
    private var pos = 0

    def print(from: Int, len: Int) = println(new String(data.slice(from, from + len).map(_.toChar)))

    def process(command: Command): Unit = command match {
      case ('add, x) => data(pos) = data(pos) + x
      case ('sub, x) => data(pos) = data(pos) - x
      case ('hi, x) => pos = (pos + x) % data.length
      case ('lo, x) => pos = (pos - x) % data.length
      case ('prn, x) => print(pos, x)
    }
  }

  private val machine = new Machine

  private val commands: List[Command] = List(
    'add -> 0x68,
    'hi -> 1,
    'add -> 0x65,
    'hi -> 1,
    'add -> 0x6c,
    'hi -> 1,
    'add -> 0x6c,
    'hi -> 1,
    'add -> 0x6f,
    'lo -> 5,
    'prn -> 6
  )

  for (command <- commands) {
    machine.process(command)
  }


}
