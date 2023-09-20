package Lesson_4

const val minWeightAverage = 35
const val maxWeightAverage = 100
const val volumeAverage = 100
fun main() {
    val weightOfTheFirstLoad = 20
    val weightOfTheFirstVolume = 80

    println(
        "Груз с весом $weightOfTheFirstLoad кг и объемом $weightOfTheFirstVolume л соответствует категории" +
                " 'Average': ${
                    weightOfTheFirstLoad >= minWeightAverage && weightOfTheFirstLoad <= maxWeightAverage &&
                            weightOfTheFirstVolume < volumeAverage
                }"
    )

    val weightOfTheSecondLoad = 50
    val weightOfTheSecondVolume = 100

    println(
        "Груз с весом $weightOfTheSecondLoad кг и объемом $weightOfTheSecondVolume л соответствует категории" +
                " 'Average': ${
                    weightOfTheSecondLoad >= minWeightAverage && weightOfTheSecondLoad <= maxWeightAverage &&
                            weightOfTheSecondVolume < volumeAverage
                }"
    )

}