package cn
import scala.collection.mutable.{ListBuffer => List}
class Directory(name: String) extends AbstractItem(name) {
  private val elements: List[Item] = List()
  def getElements(): List[Item] = elements
  def getSize() = elements.map(x => x.getSize()).sum
  def add(i: Item) = {
    elements += i
  }
  def accept(v: Visitor) = v.visitDirectory(this)
}
