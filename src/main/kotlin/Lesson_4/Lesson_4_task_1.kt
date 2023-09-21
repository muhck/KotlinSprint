package Lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    var reservedTablesToday = 13
    var reservedTablesTomorrow = 9

    println("Доступность столиков на сегодня:${reservedTablesToday < Number_of_Tables}\n" +
            "Доступность столиков на завтра:${reservedTablesTomorrow < Number_of_Tables}")
}
