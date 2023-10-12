package Lesson_10

fun main() {
    print("Чтобы задать длину сгенерированного пароля, введите необходимое количество символов: ")
    val enteredNumber = readln().toInt()

    println("Вот ваш пароль: ${passwordGeneration(enteredNumber)}")
}

fun passwordGeneration(ad: Int): String {

    val password = arrayOfNulls<Char>(ad)

    for (index in 1..ad step 2) {
        password[index - 1] = ('0'..'9').random()
    }

    for (index in 1..<ad step 2) {
        password[index] = " !\"#\$%&'()*+,-./".random()
    }
    return password.joinToString("")
}