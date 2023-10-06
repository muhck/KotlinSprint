package Lesson_7

fun main() {
    var activationCode = (1000 until 10000).random()

    println("Ваш код для активации: $activationCode")
    Thread.sleep(1000)

    print("Введите код для активации: ")
    var enteredCode = readln().toInt()

    while (enteredCode != activationCode) {
        println("Код введен неверно!")
        Thread.sleep(1000)

        activationCode = (1000 until 10000).random()
        println("Ваш новый код для активации: $activationCode")
        Thread.sleep(1000)

        print("Введите код для активации: ")
        enteredCode = readln().toInt()
    }
    println("Добро пожаловать!")


//    do {
//        val activationCode = (1000 until 10000).random()
//
//        println("Ваш код авторизации: $activationCode")
//        Thread.sleep(1000)
//
//        print("Введите код для авторизации: ")
//        val enteredCode = readln().toInt()
//
//    } while (enteredCode != activationCode)
//    println("Доброй пожаловать!")
}