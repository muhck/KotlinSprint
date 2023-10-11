package Lesson_9

fun main() {
    print("Напишите пять игредиентов для своего блюда через запятую: ")
    val listIngr = readln().split(", ")

    val newListIngr = listIngr.sorted()
    println("Вот ваш список ингредиентов в алфавитном порядке: ${newListIngr.joinToString(", ")}")
}