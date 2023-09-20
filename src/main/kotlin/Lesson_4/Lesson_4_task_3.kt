package Lesson_4

fun main() {
    val weatherTodaySunny = true
    val awningOpen = true
    val airHumidity = 20
    val season = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            weatherTodaySunny && awningOpen && airHumidity == 20 && season != "зима"}"
    )
}