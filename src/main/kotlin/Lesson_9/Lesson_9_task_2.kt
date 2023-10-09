package Lesson_9

fun main() {
    val listIngr = mutableListOf("курица", "морковь", "картофель")
    println("В рецепте есть базовые ингредиенты: ${listIngr.joinToString(", ")}")

    print("Желаете добавить еще? Ваш ответ: ")
    val answer = readln()

    if (answer == "да") {
        print("Какой ингредиент вы хотите добавить? Ваш ответ: ")
        listIngr.add(readln())
    } else return

    println("Теперь в рецепте есть следующие ингредиенты: ${listIngr.joinToString(", ")}")
}