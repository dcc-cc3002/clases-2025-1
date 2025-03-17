package c02

trait IAccount {
  def getBalance(): Int
  def withdraw(n: Int): Int
  def deposit(n: Int): Boolean
}
