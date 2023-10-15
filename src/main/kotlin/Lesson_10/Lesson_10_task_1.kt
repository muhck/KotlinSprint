package Lesson_10

fun main() {
    do {
        val playerPoints = randomPoints()
        val computerPoints = randomPoints()
        println("Первым ходит игрок, бросая кости, выпадает: $playerPoints")
        Thread.sleep(1000)
        println("Вторым ходит компьютер, бросая кости, выпадает: $computerPoints")
        Thread.sleep(1000)

        if (playerPoints < computerPoints) {
            print("Победил компьютер.")

        } else if (playerPoints > computerPoints) {
            print("Победило человечество.")

        } else {
            println("Ничья? Переиграем.")
            Thread.sleep(1000)
        }
    } while (playerPoints == computerPoints)
}

fun randomPoints() = (1..6).random()