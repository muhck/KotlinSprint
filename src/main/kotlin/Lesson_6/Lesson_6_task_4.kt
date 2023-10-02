package Lesson_6

fun main() {
    val numberToWin = (1..9).random()
    var attempts = 5

    print("Угадай число от 1 до 9. У тебя $attempts попыток. Введи число: ")
    var enteredNumber = readln().toInt()

    while (attempts > 1 && enteredNumber != numberToWin) {
        println("Не угадал! Осталось попыток: ${--attempts}")
        enteredNumber = readln().toInt()
    }
    if (enteredNumber == numberToWin) println("Это была великолепная игра!")
    else println("Было задано число $numberToWin")
}