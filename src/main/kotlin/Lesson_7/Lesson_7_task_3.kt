package Lesson_7

fun main() {
    print("Введите число, от которого будем выводить все чётные числа: ")
    val enteredNumber = readln().toInt()

    for (i in 1..enteredNumber)
        if (i % 2 == 0) println(i)
}