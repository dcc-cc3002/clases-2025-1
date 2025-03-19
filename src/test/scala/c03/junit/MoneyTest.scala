package c03.junit

import c03.Money
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.{BeforeEach, Test}

class MoneyTest {
    var _12CLP: Money = _
    var _14CLP: Money = _

    @BeforeEach
    def setUp(): Unit = {
        _12CLP = new Money(12, "CLP")
        _14CLP = new Money(14, "CLP")
    }

    @Test
    def testAdd(): Unit = {
        val expected = new Money(26, "CLP")
        assertEquals(expected, _12CLP.add(_14CLP), "Suma de 12 y 14 CLP")
    }
}
