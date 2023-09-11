package Lesson_1

fun main () {
    var ordersQuantity: Short = 75
    val textAfterPurchase: String = "Благодарим Вас за преобретение товара " +
            "с нашего интернет магазина"
    println("Количество заказов: $ordersQuantity")
    println("Текст по завершению покупки: \"$textAfterPurchase\"")

    var numberEmployees: Short = 2000
 // println("Количество сотрудников: $numberEmployees")

    numberEmployees = 1999
    println("Количество сотрудников: $numberEmployees")
}