package c05.constructors

class Socket(val timeout: Int = 5000, val linger: Int = 5000)

@main def socketExample(): Unit = {
  val s1 = Socket() // timeout = 5000, linger = 5000
  val s2 = Socket(1000) // timeout = 1000, linger = 5000
  val s3 = Socket(1000, 2000) // timeout = 1000, linger = 2000
  val s4 = Socket(linger = 3000)  // timeout = 5000, linger = 3000
  val s5 = Socket(timeout = 1000, linger = 3000)  // timeout = 1000, linger = 3000
  val s6 = Socket(linger = 3000, timeout = 1000)  // timeout = 1000, linger = 3000
}
