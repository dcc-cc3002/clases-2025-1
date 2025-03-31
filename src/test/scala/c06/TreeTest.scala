package c06

import munit.FunSuite

class TreeTest extends FunSuite {
  val t = new Node(
    45,
    new Node(
      34,
      new Leaf(13),
      new Leaf(25)
    ),
    new Leaf(4)
  )
  test("suma de un arbol") {
    assertEquals(t.sum(), 121)
  }
  test("min") {
    assertEquals(t.min(), 4)
  }
  test("max") {
    assertEquals(t.max(), 45)
  }
  test("arbol raro") {
    val t = new Node(13, new Leaf(14), new ElVacio)
    assertEquals(t.sum(), 27)
    assertEquals(t.min(), 13)
    assertEquals(t.max(), 14)
  }
}
