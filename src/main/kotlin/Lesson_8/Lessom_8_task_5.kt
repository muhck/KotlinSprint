package Lesson_8

fun main() {
    print("Дайте наименование блюда: ")
    val nameFood = readln()

    var arrayIngredients: Array<String> = arrayOf()
    print("Отлично! Напишите количество планируемых ингредиентов: ")
    val numberIngr = readln().toInt()

    for (i in 1..numberIngr) {
        print("Напишите $i ингредиент: ")
        arrayIngredients += readln()
    }
    println("Вот ваш список ингредиентов для блюда \"$nameFood\": ${arrayIngredients.joinToString(", ")}")
}