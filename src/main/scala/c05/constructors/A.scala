package c05.constructors

class A(val x: Int) {
  println("a")

  def this(code: String) = {
    this(code.toInt)
    println("b")
  }

  def this() = {
    this("0")
    println("c")
  }

  println("d")
}
