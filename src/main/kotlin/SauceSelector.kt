interface SauceSelector {
    val saucePrices: Map<String, Int>
    val sauceStatistics: MutableMap<String, Int>
    fun selectSauce() {
        println("Выберите соус:")
        println("1. Томатный соус")
        println("2. Сливочный соус")
        when (readln()) {
            "1" -> {
                val sauce = "Томатный соус"
                sauceStatistics[sauce] = sauceStatistics.getOrDefault(sauce, 0) + 1
            }

            "2" -> {
                val sauce = "Сливочный соус"
                sauceStatistics[sauce] = sauceStatistics.getOrDefault(sauce, 0) + 1
            }

            else -> {
                println("Некорректный выбор, используется томатный соус по умолчанию.")
                val sauce = "Томатный соус"
                sauceStatistics[sauce] = sauceStatistics.getOrDefault(sauce, 0) + 1
            }
        }
    }

    fun getSaucePrice(sauce: String): Int {
        return saucePrices[sauce] ?: 0
    }

    fun getSauceRevenue(): Int {
        return sauceStatistics.entries.sumOf { (sauce, count) -> getSaucePrice(sauce) * count }
    }
}
