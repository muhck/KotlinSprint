package Lesson_4

val IS_SUNNY = true
val IS_AWNING_OPEN = true
val AIR_HUMIDITY = 20
val SEASON = "зима"

fun main() {
    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            IS_SUNNY && IS_AWNING_OPEN && AIR_HUMIDITY == 20 && SEASON != "зима"
        }"
    )
}