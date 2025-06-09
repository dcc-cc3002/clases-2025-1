package cn

trait Item {
  def getSize(): Int
  def getName(): String
  def accept(v: Visitor): Unit
}
