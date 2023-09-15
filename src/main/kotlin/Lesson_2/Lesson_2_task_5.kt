package Lesson_2

import kotlin.math.pow

fun main() {
    var enteredAmount = 70000
    val interestRate = 16.7
    val term = 20

    var result = enteredAmount * ((1 + interestRate / 100).pow(term))

    println("Итоговая сумма вклада от ${enteredAmount}руб при ${interestRate}% годовых через ${term}лет составит" +
            " - ${"%.3f".format(result)}руб")
}