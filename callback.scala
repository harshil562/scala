
//First way to do a callback in Scala 

object Timer {
  def oncePerSecond(callback: => Unit) {
    while (true) { callback; Thread sleep 1000 }
  }
  def timeFlies(x: Int) {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFlies(5))
  }
}

// Another way to do a callback in Scala

object argumentCallback {
  def oncePerSecond(callback: (Int) => Unit) {
    val x = 5
    while (true) { callback(x); Thread sleep 1000 }
  }
  def timeFlies(x: Int) {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}