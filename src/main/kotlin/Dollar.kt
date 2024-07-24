package fr.wycash

data class Dollar(override val amount: Int): Currency(amount) {
    override fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}
