package Lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"

fun main() {
    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            IS_SUNNY && IS_AWNING_OPEN && AIR_HUMIDITY == 20 && SEASON != "зима"
        }"
    )
}
