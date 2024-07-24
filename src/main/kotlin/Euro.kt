package fr.wycash

data class Euro(override var amount: Int): Currency(amount) {
    override fun times(multiplier: Int): Euro {
        return Euro(amount * multiplier)
    }
}
