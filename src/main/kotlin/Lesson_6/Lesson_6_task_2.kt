package Lesson_6

fun main() {
    print("Введите время в секундах для активации таймера: ")
    val enteredTime = readln().toLong()
    val enteredTimeInMilliseconds = enteredTime * 1000
    Thread.sleep(enteredTimeInMilliseconds)

    println("Прошло $enteredTime секунд")
}