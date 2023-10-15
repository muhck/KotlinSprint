package Lesson_10

fun main() {
    var numberWins = 0
    do {
        val numberWinse = gameStep(randomPoint(), randomPoint())
        if (numberWinse == 1) numberWins++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val continueGame = readln()
    } while (continueGame == "да")
    printNumberWins(numberWins)
}

fun randomPoint() = (1..6).random()

fun gameStep(randomNumber1: Int, randomNumber2: Int): Int {
    var winningPlayer = 0
    do {
        println("Первым ходит игрок, бросая кости, выпадает: $randomNumber1")
        Thread.sleep(1000)
        println("Вторым ходит компьютер, бросая кости, выпадает: $randomNumber2")
        Thread.sleep(1000)

        if (randomNumber1 < randomNumber2) {
            println("Победил компьютер.")

        } else if (randomNumber1 > randomNumber2) {
            winningPlayer++
            println("Победило человечество.")
        } else {
            println("Ничья? Переиграем.")
            Thread.sleep(1000)
        }
    } while (randomNumber1 == randomNumber2)
    return winningPlayer
}

fun printNumberWins(number: Int) = print("Количество побед у человека: $number")