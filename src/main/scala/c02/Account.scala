package c02

class Account(private var balance: Int, _currency: String) extends IAccount {
  // private var balance: Int = _balance
  private val currency: String = _currency

  def getBalance(): Int = {
    balance
  }

  def withdraw(n: Int): Int = {
    if (n > balance) {
      val oldBalance = balance
      balance -= balance
      oldBalance
    } else {
      balance -= n
      n
    }
  }

  def deposit(n: Int): Boolean = {
    if (n > 0) {
      balance += n
      true
    } else false
  }
}
