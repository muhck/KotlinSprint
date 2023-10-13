package Lesson_10

const val MINIMUM_STRING_LENGHT = 4

fun main() {
    println("Для регистрации в приложении придумайте логин и пароль. Они должны содержать минимум 4 символа.")
    print("Сперва придумайте логин: ")
    val userLogin = readln()
    print("Теперь придумайте пароль: ")
    val userPassword = readln()

    lengthChek(userLogin, userPassword)
}

fun lengthChek(login: String, password: String) {
    if (login.length < MINIMUM_STRING_LENGHT || password.length < MINIMUM_STRING_LENGHT)
        println("Логин или пароль недостаточно длинные.")
    else println("Добро пожаловать!")
}