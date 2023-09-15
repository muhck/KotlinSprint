package Lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var stepNumber = 1
    var stepInfo = "$from-$to;$stepNumber"

    println(stepInfo)

    from = "D2"
    to = "D3"

    stepInfo = "$from-$to;${++stepNumber}"
    println(stepInfo)
}