package cn

abstract class AbstractFile(name: String) extends AbstractItem(name) {
  protected val size: Int
  def getSize(): Int = size
}
