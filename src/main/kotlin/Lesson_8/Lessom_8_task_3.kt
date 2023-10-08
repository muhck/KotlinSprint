package Lesson_8

fun main() {
    val arrayIngredients = arrayOf("колбаса", "яйцо", "горошек", "огурцы", "картошка", "морковь", "майонез")
    print("Напиши название ингредиента, который необходимо найти: ")
    val enteredIngredient = readln()
    val found = enteredIngredient in arrayIngredients

    if (found) println("Ингредиент $enteredIngredient в рецепте есть")
    else println("Ингредиента $enteredIngredient в рецепте нет")
}