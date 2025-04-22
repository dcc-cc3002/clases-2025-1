package c10

class A:
  private def foo() = println("A.foo")
  def bar() =
    this.foo()
class B extends A:
  def lack() = bar()
  def foo() = println("B.foo")
//new B().lack()

object Visibility {
  def main(args: Array[String]): Unit = {
    new B().lack()
  }
}
