package Lesson_2

fun main() {
    val hourStart = 9
    val minuteStart = 39
    val travelTime = 457
    val travelHours = travelTime / 60
    val travelMinute = 457 % 60

    val arrivalHour = travelHours + hourStart + (minuteStart + travelMinute) / 60
    val arrivalMinute = (travelMinute + minuteStart) % 60

    println("Время прибытия поезда - $arrivalHour:$arrivalMinute")
}