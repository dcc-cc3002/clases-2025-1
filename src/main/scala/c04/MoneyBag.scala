package c04
import scala.collection.mutable.Map

class MoneyBag {
  val _moneys: Map[String, Money] = Map()
  def this(s: Set[Money]) = {
    this()
    for (money <- s) {
      add(money)
    }
  }
  def this(m1: Money, m2: Money) = {
    this(Set(m1, m2))
  }
  def add(newMoney: Money): MoneyBag = {
    // primero chequeamos si existe al divisa en nuestro Map
    val oActual: Option[Money] = _moneys.get(newMoney.getCurrency)
    val nuevoMonto = if (oActual.isDefined) {
      // segundo, vemos que es lo que hay
      val actual: Money = oActual.get
      actual.add(newMoney)
    } else {
      newMoney
    }
    _moneys += (newMoney.getCurrency -> nuevoMonto)
    this
  }
  def add(mbs: MoneyBag): MoneyBag = {
    for ((currency, money) <- mbs._moneys) {
      add(money)
    }
    this
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[MoneyBag]) {
      val other = obj.asInstanceOf[MoneyBag]
      _moneys == other._moneys
    } else false
  }
}
