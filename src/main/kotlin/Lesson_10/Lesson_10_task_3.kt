package Lesson_10

fun main() {
    print("Чтобы задать длину сгенерированного пароля, введите необходимое количество символов: ")
    val enteredNumber = readln().toInt()

    print("Вот ваш пароль: ")
    generatePassword(enteredNumber)
}

fun generatePassword(passwordLength: Int) {
    val password = arrayOfNulls<Char>(passwordLength)

    for (index in 1..passwordLength) {
        when (index % 2) {
            1 -> password[index - 1] = ('0'..'9').random()
            0 -> password[index - 1] = (32..47).random().toChar()
        }
    }
    return password.forEach { print(it) }
}