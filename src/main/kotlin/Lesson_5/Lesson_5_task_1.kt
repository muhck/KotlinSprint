package Lesson_5

import kotlin.random.Random

fun main() {
    val random = Random
    val firstRandonNumber = random.nextInt(10)
    val secondRandonNumber = random.nextInt(10)

    val result = firstRandonNumber + secondRandonNumber

    print("Решите пример: $firstRandonNumber + $secondRandonNumber = ")
    val enteredValue = readln().toInt()

    if (enteredValue == result) println("Добро пожаловать!")
    else println("Доступ запрещен!")
}