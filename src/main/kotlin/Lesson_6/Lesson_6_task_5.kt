package Lesson_6

fun main() {
    var firstRandonNumber = (1..9).random()
    var secondRandonNumber = (1..9).random()

    val result = firstRandonNumber + secondRandonNumber
    var attempts = 2

    print("Решите пример: $firstRandonNumber + $secondRandonNumber = ")
    var enteredValue = readln().toInt()

    while (attempts > 0 && enteredValue != result) {
        firstRandonNumber = (1..9).random()
        secondRandonNumber = (1..9).random()
        print(
            "Неправильный ответ. Осталось попыток: ${attempts--}. " +
                    "Решите пример: $firstRandonNumber + $secondRandonNumber = "
        )
        enteredValue = readln().toInt()
    }

    if (enteredValue == result) println("Добро пожаловать!")
    else println("Доступ запрещен!")
}