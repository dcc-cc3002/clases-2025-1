package c03.munit

import c03.Money

class MoneyTest extends munit.FunSuite {
  var _12CLP: Money = _
  var _14CLP: Money = _

  override def beforeEach(context: BeforeEach): Unit = {
    _12CLP = Money(12, "CLP")
    _14CLP = Money(14, "CLP")
  }

  test("Money addition") {
    val result = _12CLP.add(_14CLP)
    assertEquals(result, Money(26, "CLP"))
  }
}
