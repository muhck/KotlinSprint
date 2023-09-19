package Lesson_3

fun main() {
    var stepInfo = "D2-D4;0"
    var list = stepInfo.split("-", ";")
    var from = list[0]
    var to = list[1]
    var stepNumber = list[2]

    println(
        """
        $from
        $to
        $stepNumber
    """.trimIndent()
    )
}