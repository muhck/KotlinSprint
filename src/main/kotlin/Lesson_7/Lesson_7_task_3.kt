package Lesson_7

fun main() {
    print("Введите число, от которого будем выводить все чётные числа: ")
    val enteredNumber = readln().toInt()

    for (i in 0..enteredNumber step 2)
    println(i)
}
