package c04

class Money(private var amount: Int, _currency: String) {
  // getters!
  def getAmount: Int = amount
  def getCurrency: String = _currency

  override def toString(): String = {
    s"Money($amount, $_currency)"
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[Money]) {
      val other: Money = obj.asInstanceOf[Money]
      getAmount == other.getAmount && getCurrency == other.getCurrency
    } else false
  }

  def add(other: Money): Money = {
    // if (getCurrency == other.getCurrency)
    new Money(getAmount + other.getAmount, getCurrency)
    // else
    //  new MoneyBag(this, other)
  }
}
