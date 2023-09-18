package Lesson_4

fun main() {
    val numberOfTables = 13
    var reservedTablesToday = 13
    var reservedTablesTomorrow = 9

    println("Доступность столиков на сегодня:${reservedTablesToday < numberOfTables}\n" +
            "Доступность столиков на завтра:${reservedTablesTomorrow < numberOfTables}")
}