package Lesson_6

fun main() {
    print("Придумай логин для входа: ")
    val registerLogin = readln()
    print("Теперь придумай пароль: ")
    val registerPassword = readln()
    println("Поздравляю! Вы прошли регистрацию.")
    Thread.sleep(1000)

    print("Введите логин для входа: ")
    var login = readln()

    while (login != registerLogin) {
        print("Пользователь с логином \"$login\" не найден. Введите логин для входа: ")
        login = readln()
    }

    print("Введите пароль для входа: ")
    var password = readln()

    var attempt = 3

    while (password != registerPassword && attempt > 0) {
        password = if (attempt > 1) {
            print("Для логина \"$login\" пароль неверный! Осталось ${attempt--} попытки. Введите пароль для входа: ")
            readln()
        } else {
            print("Для логина \"$login\" пароль неверный! Осталось ${attempt--} попыткa. Введите пароль для входа: ")
            readln()
        }
    }

    if (password == registerPassword) println("Авторизация прошла успешно!")
    else println("Доступ заблокирован! Попробуйте позже.")
}