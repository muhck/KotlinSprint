package Lesson_9

fun main() {
    val listOneDish = listOf(2, 50, 15)

    print("Введите количество блюд для приготовления: ")
    val numberOfDishes = readln().toInt()

    val newListDish = listOneDish.map { it * numberOfDishes }

    println(
        "На $numberOfDishes порций вам понадобится: яиц-${newListDish[0]}, молока-${newListDish[1]}," +
                " сливочного масла-${newListDish[2]}."
    )
}