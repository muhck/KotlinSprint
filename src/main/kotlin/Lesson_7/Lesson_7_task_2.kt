package Lesson_7

fun main() {
    var activationCode = (1000 until 10000).random()

    println("Ваш код авторизации: $activationCode")
    Thread.sleep(1000)

    print("Введите код для авторизации: ")
    val enteredCode = readln().toInt()

    while (enteredCode != activationCode) {
        println("Код введен неверно.")
        activationCode = (1000 until 10000).random()

        println("Ваш новый код авторизации: $activationCode")
        Thread.sleep(1000)

        print("Введите код для авторизации: ")
        val enteredCode = readln().toInt()
        if (enteredCode == activationCode) break
    }
    println("Доброй пожаловать!")
}