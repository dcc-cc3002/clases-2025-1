package c05.polymorphism

object Foo {
  def foo(x: Duck): Unit = {
    x.m1()
  }

//  foo(new Witch)
}
