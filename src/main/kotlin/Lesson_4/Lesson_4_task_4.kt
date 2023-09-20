package Lesson_4

fun main() {
    var trainingDay = 5 % 2

    println(
        "Упражнения для рук: ${trainingDay == 1} \nУпражнения для ног: ${trainingDay == 0} \n" +
                "Упражнения для спины: ${trainingDay == 0} \nУпражнения для пресса: ${trainingDay == 1}"
    )
}