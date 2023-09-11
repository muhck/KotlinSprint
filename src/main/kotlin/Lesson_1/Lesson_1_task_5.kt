package Lesson_1

fun main () {
    val secondInSpase = 6480
    val minuteInSpace = secondInSpase / 60
    val hoursInSpace = minuteInSpace / 60
    val overMinuteInSpace = minuteInSpace % 60
    val overSecondInSpase = secondInSpase % 60

    // println("0$hoursInSpace:$overMinuteInSpace:0$overSecondInSpase") первый вариант, который пришел в голову
    println("${"%02d".format(hoursInSpace)}:${"%02d".format(overMinuteInSpace)}:" +
            "${"%02d".format(overSecondInSpase)}")


}