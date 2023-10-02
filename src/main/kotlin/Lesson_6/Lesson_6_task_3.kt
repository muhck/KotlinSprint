package Lesson_6

fun main() {
    print("Введите время в секундах для активации таймера: ")
    var enteredTime = readln().toInt()

    while (enteredTime > 0) {
        if (enteredTime >= 5) println("Осталось ${enteredTime--} секунд")
        else if (enteredTime > 1) println("Осталось ${enteredTime--} секунды")
        else println("Осталось ${enteredTime--} секунда")
        Thread.sleep(1000)
    }

    println("Время вышло.")
}