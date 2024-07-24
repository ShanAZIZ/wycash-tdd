package fr.wycash

abstract class Currency(open val amount: Int) {

    override fun hashCode(): Int {
        return amount
    }

    abstract fun times(multiplier: Int): Currency

    override fun equals(other: Any?): Boolean {
        if (other !is Currency) return false
        if (amount != other.amount) return false
        return true
    }

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount)
        fun euro(amount: Int): Euro = Euro(amount)
    }
}