package Lesson_9

import java.util.*

fun main() {
    val listIngr: MutableList<String> = mutableListOf()
    println("Напишите пять игредиентов для своего блюда.")

    for (i in 1..5) {
        print("$i ингредиент: ")
        var ingr = readln()

        while (listIngr.contains(ingr)) {
            println("Ингредиент $ingr уже есть в списке. Попробуй ввести другой: ")
            ingr = readln()
        }
        listIngr.add(ingr)
    }

    listIngr.sort()
    println(
        "Вот ваш список ингредиентов  в алфавитном порядке: ${
            listIngr.joinToString(", ")
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }"
    )
}