package Lesson_11

class User2(
    val login: String,
    var password: String,
    val email: String,
    val uniqueIndentifier: String,
    var bio: String,
) {
    fun outputOfUserData() {
        println(
            """Вот данные пользователя:
            | логин: $login;
            | пароль: $password;
            | почта: $email;
            | Уникальный идентификатор: $uniqueIndentifier;
            | биография: $bio.
        """.trimMargin()
        )
    }

    fun addEntryToBio() {
        print("Напишите данные о себе, чтобы добавить данные: ")
        bio = readln()
        println("ваши данные добавлены!")
    }

    fun changePassword() {
        print("Чтобы поменять пароль, введите старый: ")
        do {
            val enteringOldPassword = readln()
            if (enteringOldPassword != password) {
                print("Пароль введён неверно. Попробуй ещё: ")
            } else {
                print("Введите новый пароль: ")
                password = readln()
                println("Пароль успешно заменён!")
                return
            }
        } while (enteringOldPassword != password)
    }
}

fun main() {
    val userData1 = User2(
        login = "koshka_moshka",
        password = "12345678",
        email = "koshka@gmail.com",
        uniqueIndentifier = "64523457",
        bio = ""
    )

    userData1.addEntryToBio()
    println()
    userData1.changePassword()
    println()
    userData1.outputOfUserData()
}