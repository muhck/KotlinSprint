package Lesson_5

import java.util.*

val DATE = Calendar.getInstance()
val AGE_OF_MAGORITY = DATE.get(Calendar.YEAR) - 18

fun main() {
    print("Введите год рождения: ")
    val userYearOfBirth = readLine()!!.toInt()

    val resultText = if (userYearOfBirth <= AGE_OF_MAGORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(resultText)
}