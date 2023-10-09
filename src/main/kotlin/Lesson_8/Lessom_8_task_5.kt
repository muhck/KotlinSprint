package Lesson_8

fun main() {
    print("Дайте наименование блюда: ")
    val nameFood = readln()

    print("Отлично! Напишите количество планируемых ингредиентов: ")
    val numberIngr = readln().toInt()
    val arrayIngr = arrayOfNulls<String>(numberIngr)

    for (index in 1..numberIngr) {
        print("Напишите $index ингредиент: ")
        arrayIngr[index - 1] = readln()
    }
    println("Вот ваш список ингредиентов для блюда \"$nameFood\": ${arrayIngr.joinToString(", ")}")
}