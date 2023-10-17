package Lesson_11

class User(
    val login: String,
    val password: String,
    val email: String,
    val uniqueIndentifier: String,
) {
    fun outputOfUserData() {
        println(
            """Вот данные пользователя:
            | логин: $login;
            | пароль: $password;
            | почта: $email;
            | Уникальный идентификатор: $uniqueIndentifier.
        """.trimMargin()
        )
    }
}

fun main() {
    val userData1 = User(
        login = "koshka_moshka",
        password = "12345678",
        email = "koshka@gmail.com",
        uniqueIndentifier = "64523457"
    )
    val userData2 = User(
        login = "student_ivana",
        password = "87654321",
        email = "studentdima@mail.ru",
        uniqueIndentifier = "21346342"
    )
    userData1.outputOfUserData()
    println()
    userData2.outputOfUserData()
}