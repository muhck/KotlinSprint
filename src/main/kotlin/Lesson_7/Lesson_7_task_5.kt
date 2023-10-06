package Lesson_7

fun main() {
    print("Чтобы задать длину сгенерированного пароля, введите необходимое количество символов: ")
    val enteredNumber = readln().toInt()

    val password = CharArray(enteredNumber) {
        listOf('a'..'z', 'A'..'Z', '0'..'9').random().random()
    }
    println(password)
}