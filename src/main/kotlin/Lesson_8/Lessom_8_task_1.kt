package Lesson_8

fun main() {
    val arrayWeek = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
    val arrayOfViews = arrayOf(35, 28, 31, 25, 32, 57, 44)

    for ((i, d) in arrayWeek.withIndex()) {
        println("Просмотров в $d: ${arrayOfViews[i]}")
        Thread.sleep(500)
    }

    println("\nВсего просмотров за неделю: ${arrayOfViews.sum()}")
}