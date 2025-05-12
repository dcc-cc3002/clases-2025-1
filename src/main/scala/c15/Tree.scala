package c15

case class Persona(val nombre: String, val edad: Int)
    extends Comparable[Persona]:
  def compareTo(other: Persona): Int =
    if (edad > other.edad) 1
    else if (edad < other.edad) -1
    else if (nombre > other.nombre) 1
    else if (nombre < other.nombre) -1
    else 0

trait Tree[T <: Comparable[T]]:
  def find(x: T): Boolean
  def max(): T

class InnerNode[R <: Comparable[R]](v: R, left: Tree[R], right: Tree[R])
    extends Tree[R]:
  def find(x: R): Boolean =
    v.compareTo(x) == 0 || left.find(x) || right.find(x)
  def max(): R =
    val lmax = left.max()
    val rmax = right.max()
    // max(v, lmax, rmax)
    if (v.compareTo(lmax) > 0)
      if (v.compareTo(rmax) > 0)
        v
      else
        rmax
    else if (lmax.compareTo(rmax) > 0)
      lmax
    else rmax

class Leaf[R <: Comparable[R]](v: R) extends Tree[R]:
  def find(x: R): Boolean = v.compareTo(x) == 0
  def max(): R = v

object Main {
  def main(args: Array[String]) =
    val leaf1 = new Leaf[Persona](new Persona("Foo", 10))
    val leaf2 = new Leaf[Persona](new Persona("Bar", 10))
    val tree =
      new InnerNode[Persona](new Persona("Tralalero Tralala", 5), leaf1, leaf2)
    println(tree.find(new Persona("Foo", 10)))
    println(tree.max())
}
