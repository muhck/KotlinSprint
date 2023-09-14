package Lesson_1

fun main () {
    val secondInSpase = 6480
    val minuteInSpace = secondInSpase / 60
    val hoursInSpace = minuteInSpace / 60
    val overMinuteInSpace = minuteInSpace % 60
    val overSecondInSpase = secondInSpase % 60

    println("%02d:%02d:%02d".format(hoursInSpace,overMinuteInSpace,overSecondInSpase))
}