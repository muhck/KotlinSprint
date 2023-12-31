package Lesson_8

fun main() {
    val arrayIngredients = arrayOf("колбаса", "яйцо", "горошек", "огурцы", "картошка", "морковь", "майонез")
    println("Вот список ингредиентов для салата оливье: ${arrayIngredients.joinToString(", ")}")
    print("Напиши название ингредиента, который необходимо заменить: ")
    val enteredIngredient = readln()
    val found = enteredIngredient in arrayIngredients

    if (!found) println("Ингредиента $enteredIngredient в рецепте нет")
    else {
        print("Ингредиент $enteredIngredient заменить на: ")
        val newIngredient = readln()
        val indexIngredient = arrayIngredients.indexOf(enteredIngredient)
        arrayIngredients[indexIngredient] = newIngredient
        println("Готово! Вы сохранили следующий список: ${arrayIngredients.joinToString(", ")}")
    }
}