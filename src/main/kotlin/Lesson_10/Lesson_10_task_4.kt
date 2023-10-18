package Lesson_10

fun main() {
    val arrayToContinueGame = arrayOf("да", "Да", "ДА")
    var numberWinsPlayer = 0
    do {
        val winPlayer = appointWinner()
        if (winPlayer) numberWinsPlayer++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val continueGame = readln()
        val found = arrayToContinueGame.any { continueGame == it }
    } while (found)
    printNumberOfWins(numberWinsPlayer)
}

fun appointWinner(): Boolean {
    var winPlayer = false
    do {
        val playerPoints = (1..6).random()
        val computerPoints = (1..6).random()
        println("Первым ходит игрок, бросая кости, выпадает: $playerPoints")
        Thread.sleep(1000)
        println("Вторым ходит компьютер, бросая кости, выпадает: $computerPoints")
        Thread.sleep(1000)

        if (playerPoints < computerPoints) {
            println("Победил компьютер.")

        } else if (playerPoints > computerPoints) {
            winPlayer = true
            println("Победило человечество.")
        } else {
            println("Ничья? Переиграем.")
            Thread.sleep(1000)
        }
    } while (playerPoints == computerPoints)
    return winPlayer
}

fun printNumberOfWins(number: Int) = print("Количество побед у человека: $number")