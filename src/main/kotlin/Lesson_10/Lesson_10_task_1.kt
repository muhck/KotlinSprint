package Lesson_10

fun main() {
    var playerPoints: Int
    var computerPoints: Int
    do {
        playerPoints = randomPoints()
        computerPoints = randomPoints()
        println("Первым ходит игрок, бросая кости, выпадает: $playerPoints")
        Thread.sleep(1000)
        println("Вторым ходит компьютер, бросая кости, выпадает: $computerPoints")
        Thread.sleep(1000)

        if (playerPoints == computerPoints) {
            println("Ничья? Переиграем.")
            Thread.sleep(1000)
        }
    } while (playerPoints == computerPoints)

    if (playerPoints > computerPoints) print("Победило человечество.")
    else print("Победил компьютер.")
}

fun randomPoints() = (1..6).random()