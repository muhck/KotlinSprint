package Lesson_7

fun main() {
    print("Введите количество секунд которые нужно засечь: ")
    val enteredNumber = readln().toInt()

    for (i in enteredNumber downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
    print("Время вышло!")
}