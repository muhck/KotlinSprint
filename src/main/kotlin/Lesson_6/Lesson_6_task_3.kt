package Lesson_6

fun main() {
    print("Введите время в секундах для активации таймера: ")
    var enteredTime = readln().toInt()

    while (enteredTime > 0) {
        println("Осталось секунд: ${enteredTime--}")
        Thread.sleep(1000)
    }

    println("Время вышло.")
}