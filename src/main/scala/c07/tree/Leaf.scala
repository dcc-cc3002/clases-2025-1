package c07.tree

class Leaf(val value: Int) extends Tree {
  def sum: Int = value
  def min: Int = value
  def max: Int = value

  override def compareTo(that: Comparable): Int = {
    super.getClass == this.getClass
    // NO DEBEN hacer esto (isInstanceOf), pero en este caso resulta necesario porque no hemos visto generics
    if (that.isInstanceOf[Tree]) {
      val tree = that.asInstanceOf[Tree]
      tree.sum - sum
    } else {
      Int.MinValue
    }
  }
}

@main def test(): Unit =
  new Leaf(10).compareTo(new Leaf(10))
