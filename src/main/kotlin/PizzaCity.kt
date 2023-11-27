abstract class PizzaCity(
    private val neapolitanPizzaPrice: Double,
    private val romanPizzaPrice: Double,
    private val sicilianPizzaPrice: Double,
    private val tyroleanPizzaPrice: Double
) {
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0

    var countCustomers = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()

    abstract fun getAdditionMoney(): Int

    open fun showStatistics() {
        println("--Статистика по пиццам--:")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано тирольской пиццы: $tyroleanPizzaCount")

        val money = sicilianPizzaCount * sicilianPizzaPrice +
                neapolitanPizzaCount * neapolitanPizzaPrice +
                romanPizzaCount * romanPizzaPrice +
                tyroleanPizzaCount * tyroleanPizzaPrice + getAdditionMoney()

        println("Всего заработано денег: $money")
    }
}