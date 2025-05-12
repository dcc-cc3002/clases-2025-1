package c13

class E extends Exception
class F extends Exception

object Main {
  def foo() = {
    val x = 1
    val y = x + 1
    val z = y + 3
    throw new E()
  };
  def bar() = {
    try {
      foo()
    } catch {
      case e: E => {
        println("E.bar")
        throw e
      }
    }
  }
  def main(args: Array[String]): Unit = {
    try {
      bar()
    } catch {
      case e: F => println("main")
    }

  }
}
