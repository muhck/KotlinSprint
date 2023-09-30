package Lesson_5

import java.time.LocalDateTime

const val AGE_OF_MAJORITY = 18

fun main() {

    val ageOfMajority = LocalDateTime.now().year - AGE_OF_MAJORITY
    print("Введите год рождения: ")
    val userYearOfBirth = readln().toInt()

    val resultText = if (userYearOfBirth <= ageOfMajority) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(resultText)
}