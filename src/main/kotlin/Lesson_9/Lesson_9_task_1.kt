package Lesson_9

fun main() {
    val listIngredients = listOf("колбаса", "яйцо", "горошек", "огурцы", "картошка", "морковь", "майонез")

    println("В рецепте есть следующие ингредиенты:")
    listIngredients.forEach { println(it) }
}