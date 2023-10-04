package Lesson_7

fun main() {
    print("Введите количество секунд которые нужно засечь: ")
    val enteredNumber = readln().toInt()

    for (i in enteredNumber downTo 0) {
        if (i == 0) {
            print("Время вышло!")
            return
        }
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
}