package Lesson_4

fun main() {
    var trainingDay = 5
    val calculationFormula = trainingDay % 2

    println(
        "Упражнения для рук: ${calculationFormula == 1} \nУпражнения для ног: ${calculationFormula == 0} \n" +
                "Упражнения для спины: ${calculationFormula == 0} \nУпражнения для пресса: ${calculationFormula == 1}"
    )
}
