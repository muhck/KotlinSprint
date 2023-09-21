package Lesson_4

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val AVERAGE_VOLUME = 100

fun main() {
    val weightOfTheFirstLoad = 20
    val weightOfTheFirstVolume = 80

    println(
        "Груз с весом $weightOfTheFirstLoad кг и объемом $weightOfTheFirstVolume л соответствует категории" +
                " 'Average': ${
                    weightOfTheFirstLoad >= MIN_WEIGHT_AVERAGE && weightOfTheFirstLoad <= MAX_WEIGHT_AVERAGE &&
                            weightOfTheFirstVolume < AVERAGE_VOLUME
                }"
    )

    val weightOfTheSecondLoad = 50
    val weightOfTheSecondVolume = 100

    println(
        "Груз с весом $weightOfTheSecondLoad кг и объемом $weightOfTheSecondVolume л соответствует категории" +
                " 'Average': ${
                    weightOfTheSecondLoad >= MIN_WEIGHT_AVERAGE && weightOfTheSecondLoad <= MAX_WEIGHT_AVERAGE &&
                            weightOfTheSecondVolume < AVERAGE_VOLUME
                }"
    )

}
