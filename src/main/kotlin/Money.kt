package fr.wycash

open class Money(open val amount: Int, open val currency: String) {

    override fun hashCode(): Int {
        return amount
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Money) return false
        if (currency !== other.currency) return false
        if (amount != other.amount) return false
        return true
    }

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun euro(amount: Int): Money = Money(amount, "EUR")
    }
}