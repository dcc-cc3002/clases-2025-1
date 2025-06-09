package cn

abstract class AbstractItem(private val name: String) extends Item {
  def getName(): String = name
}
