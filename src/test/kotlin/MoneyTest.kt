import fr.wycash.Currency
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

class MoneyTest {

    @Test
    fun dollarMultiplicationTest() {
        val five: Currency = Currency.dollar(5)
        assertEquals(Currency.dollar(10), five.times(2))
        assertEquals(Currency.dollar(15), five.times(3))
    }

    @Test
    fun euroMultiplicationTest() {
        val five = Currency.euro(5)
        assertEquals(Currency.euro(10), five.times(2))
        assertEquals(Currency.euro(15), five.times(3))
    }

    @Test
    fun equalityTest() {
        assertEquals(Currency.dollar(5), Currency.dollar(5))
        assertNotEquals(Currency.dollar(5), Currency.dollar(6))
        assertEquals(Currency.euro(5), Currency.euro(5))
        assertNotEquals(Currency.euro(5), Currency.euro(6))
        assertFalse(Currency.euro(5).equals(Currency.dollar(5)))
    }

}