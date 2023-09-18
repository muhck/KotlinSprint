package Lesson_3

fun main() {
    var stepInfo = "D2-D4;0"
    var from = stepInfo.removeRange(2..6)
    var to = stepInfo.substring(3..4)
    var stepNumber = stepInfo.removeRange(0..5)

    println(
        """
        $from
        $to
        $stepNumber
    """.trimIndent()
    )
}