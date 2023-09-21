package Lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    var reservedTablesToday = 13
    var reservedTablesTomorrow = 9

    println("Доступность столиков на сегодня:${reservedTablesToday < NUMBER_OF_TABLES}\n" +
            "Доступность столиков на завтра:${reservedTablesTomorrow < NUMBER_OF_TABLES}")
}
