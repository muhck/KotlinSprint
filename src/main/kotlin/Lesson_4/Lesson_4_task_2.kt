package Lesson_4

const val Min_Weight_Average = 35
const val Max_Weight_Average = 100
const val Volume_Average = 100
fun main() {
    val weightOfTheFirstLoad = 20
    val weightOfTheFirstVolume = 80

    println(
        "Груз с весом $weightOfTheFirstLoad кг и объемом $weightOfTheFirstVolume л соответствует категории" +
                " 'Average': ${
                    weightOfTheFirstLoad >= Min_Weight_Average && weightOfTheFirstLoad <= Max_Weight_Average &&
                            weightOfTheFirstVolume < Volume_Average
                }"
    )

    val weightOfTheSecondLoad = 50
    val weightOfTheSecondVolume = 100

    println(
        "Груз с весом $weightOfTheSecondLoad кг и объемом $weightOfTheSecondVolume л соответствует категории" +
                " 'Average': ${
                    weightOfTheSecondLoad >= Min_Weight_Average && weightOfTheSecondLoad <= Max_Weight_Average &&
                            weightOfTheSecondVolume < Volume_Average
                }"
    )

}