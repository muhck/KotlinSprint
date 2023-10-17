package Lesson_10

const val LOGIN_USER = "koshka_moshka"
const val PASSWORD_USER = "12345678"
val BASKET_OF_PRODUCTS = arrayOf("кровать", "матрас", "набор инструментов", "картина", "комод", "скотч")
fun main() {
    print("Введите логин для входа: ")
    val loginInput = readln()
    print("Введите пароль для входа: ")
    val passwordInput = readln()

    if (generateToken(loginInput, passwordInput) != null) {
        println("Вот ваш список покупок: ${BASKET_OF_PRODUCTS.joinToString(", ")}.")
    } else println("Неправильно введен логин или пароль.")
}

fun generateToken(login: String, password: String): String? {
    var token: String? = null
    if (login == LOGIN_USER && password == PASSWORD_USER) token = "eyJhbGciOiJIUzUxMiIsInR5cCI6IkpX"
    return token
}