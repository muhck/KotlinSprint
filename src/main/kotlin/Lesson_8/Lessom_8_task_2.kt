package Lesson_8

fun main() {
    val arrayIngredients = arrayOf("колбаса", "яйцо", "горошек", "огурцы", "картошка", "морковь", "майонез")
    print("Напиши название ингредиента, который необходимо найти: ")
    val enteredIngredient = readln()
    var found = false

    for (i in arrayIngredients.indices) {
        if (arrayIngredients[i] == enteredIngredient) {
            found = true
            break
        }
    }

    if (found) println("Ингредиент $enteredIngredient в рецепте есть")
    else println("Ингредиента $enteredIngredient в рецепте нет")
}