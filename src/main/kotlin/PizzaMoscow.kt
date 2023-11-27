class PizzaMoscow(
    neapolitanPizzaPrice: Double,
    romanPizzaPrice: Double,
    sicilianPizzaPrice: Double,
    tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice,
    romanPizzaPrice,
    sicilianPizzaPrice,
    tyroleanPizzaPrice
), CheckPhoto {

    override var countChecksShown: Int = 0
    override var totalDiscount: Int = 0

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Москве")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Москве")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Москве")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Москве")
    }

    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            totalDiscount += 50
            countChecksShown++
            println("Вам будет скидка 50 рублей")
        }
        countCustomers++
    }

    override fun showStatistics() {
        super.showStatistics()
        println()
        println("--Статистика по чекам--:")
        println("Количество покупателей: $countCustomers")
        println("Количество показов фотографии чека: $countChecksShown")
        println("Количество человек без фотографии чека: ${countCustomers - countChecksShown}")
        println("Процент показов фотографии чека: ${countChecksShown * 100 / countCustomers}%")
        println("Общая сумма скидок: $totalDiscount")
    }

    override fun getAdditionMoney(): Int {
        return -totalDiscount
    }
}