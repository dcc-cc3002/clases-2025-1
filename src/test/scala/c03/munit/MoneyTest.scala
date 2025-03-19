package c03.munit

import c03.Money

class MoneyTest extends munit.FunSuite {
    var _12CLP: Money = _
    var _14CLP: Money = _

    override def beforeEach(context: BeforeEach): Unit = {
        _12CLP = new Money(12, "CLP")
        _14CLP = new Money(14, "CLP")
    }

    test("Adding 12 and 14 CLP should be 26 CLP") {
        val expected = new Money(26, "CLP")
        assertEquals(expected, _12CLP.add(_14CLP))
    }
}
