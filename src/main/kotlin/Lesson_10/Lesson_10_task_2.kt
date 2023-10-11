package Lesson_10

fun main() {
    println("Для регистрации в приложении придумайте логин и пароль. Они должны содержать минимум 4 символа.")
    Thread.sleep(1000)
    print("Сперва придумайте логин: ")
    val userLogin = readln()
    print("Теперь придумайте пароль: ")
    val userPassword = readln()

    lengthChek(userLogin, userPassword)
}

fun lengthChek(aa: String, bb: String) {
    if (aa.length < 4 || bb.length < 4) println("Логин или пароль недостаточно длинные.")
    else println("Добро пожаловать!")
}