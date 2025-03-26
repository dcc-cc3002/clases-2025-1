package c04

import munit.FunSuite

class MoneyTest extends FunSuite {
  var _12CLP: Money = _
  var _14CLP: Money = _
  var _7USD: Money = _
  var _21USD: Money = _
  var _MB1: MoneyBag = _
  var _MB2: MoneyBag = _

  override def beforeEach(context: BeforeEach): Unit = {
    _12CLP = new Money(12, "CLP")
    _14CLP = new Money(14, "CLP")
    _7USD = new Money(7, "USD")
    _21USD = new Money(21, "USD")
    _MB1 = new MoneyBag(_12CLP, _7USD)
    _MB2 = new MoneyBag(_14CLP, _21USD)
  }
  test("equal trivial") {
    assertEquals(_12CLP, _12CLP)
    assertNotEquals(_12CLP, _14CLP)
  }
  test("equal non-trivial") {
    assertEquals(_12CLP, new Money(12, "CLP"))
  }
  test("add money") {
    assertEquals(_12CLP.add(_14CLP), new Money(26, "CLP"))
    assertEquals(_12CLP.add(_14CLP).add(_12CLP), new Money(38, "CLP"))
  }
  test("add money to moneybag") {
    assertEquals(
      _MB1.add(_12CLP),
      new MoneyBag(new Money(24, "CLP"), new Money(7, "USD"))
    )
  }
  test("add money bag") {
    assertEquals(
      _MB1.add(_MB2),
      new MoneyBag(new Money(26, "CLP"), new Money(28, "USD"))
    )
  }
  /*test("add money of different currencies") {
    assertEquals(_12CLP.add(_7USD), _MB1)
  }*/
}
