import fr.wycash.Money
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

class MoneyTest {

    @Test
    fun dollarMultiplicationTest() {
        val five = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun equalityTest() {
        assertEquals(Money.dollar(5), Money.dollar(5))
        assertNotEquals(Money.dollar(5), Money.dollar(6))
        assertEquals(Money.euro(5), Money.euro(5))
        assertNotEquals(Money.euro(5), Money.euro(6))
        assertFalse(Money.euro(5).equals(Money.dollar(5)))
    }

    @Test
    fun currencyTest() {
        assertEquals("USD", Money.dollar(5).currency)
        assertEquals("EUR", Money.euro(5).currency)
    }

}