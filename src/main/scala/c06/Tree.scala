package c06
/*
class Node(value: Int, left: Option[Node], right: Option[Node]) {
  def sum(): Int = {
    var acc = value
    if (left.isDefined)
      acc += left.get.sum()
    if (right.isDefined)
      acc += right.get.sum()
    acc
  }

  def min(): Int = {
    var acc = value
    if (left.isDefined) {
      val x = left.get.min()
      if (x < acc)
        acc = x
    }
    if (right.isDefined) {
      val x = right.get.min()
      if (x < acc)
        acc = x
    }
    acc
  }

  def max(): Int = {
    var acc = value
    if (left.isDefined) {
      val x = left.get.max()
      if (x > acc)
        acc = x
    }
    if (right.isDefined) {
      val x = right.get.max()
      if (x > acc)
        acc = x
    }
    acc
  }
}*/
trait Tree {
  def sum(): Int
  def min(): Int
  def max(): Int
}
class Node(value: Int, left: Tree, right: Tree) extends Tree {
  def sum(): Int = value + left.sum() + right.sum()
  def min() = Math.min(value, Math.min(left.min(), right.min()))
  def max() = Math.max(value, Math.max(left.max(), right.max()))
}
class Leaf(value: Int) extends Tree {
  def sum() = value
  def min() = value
  def max() = value
}
class ElVacio extends Tree {
  def sum(): Int = 0
  def min(): Int = Integer.MAX_VALUE
  def max(): Int = Integer.MIN_VALUE
}
