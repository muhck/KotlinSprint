package Lesson_9

import java.util.*

fun main() {
    val listIngr: MutableSet<String> = mutableSetOf()
    println("Напишите пять игредиентов для своего блюда.")

    for (i in 1..5) {
        print("$i ингредиент: ")
        val ingr = readln()
        listIngr.add(ingr)
    }

    val newListIngr = listIngr.sorted()
    println(
        "Вот ваш список ингредиентов  в алфавитном порядке: ${
            newListIngr.joinToString(", ")
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }"
    )
}