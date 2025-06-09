package library

class Library(someItems: List[Item] = List.empty) {
  private val _items = someItems.toBuffer

  def items: List[Item] = _items.toList

  def addItem(item: Item): Unit = _items.addOne(item)
}
