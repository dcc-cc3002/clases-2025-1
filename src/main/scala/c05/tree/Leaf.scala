package c05.tree

class Leaf(val value: Int) extends Tree {
  def sum: Int = value
  def min: Int = value
  def max: Int = value
}
