package Lesson_4

const val numberOfTables = 13

fun main() {
    var reservedTablesToday = 13
    var reservedTablesTomorrow = 9

    println("Доступность столиков на сегодня:${reservedTablesToday < numberOfTables}\n" +
            "Доступность столиков на завтра:${reservedTablesTomorrow < numberOfTables}")
}
