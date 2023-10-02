package Lesson_5

const val FIRST_CORRECT_NUMBER = 7
const val SECOND_CORRECT_NUMBER = 56

fun main() {
    print("Испытай удачу! Угадай первое число от 1 до 100: ")
    val firstNumberEntered = readln().toInt()
    print("Испытай удачу! Угадай второе число от 1 до 100: $firstNumberEntered, ")
    val secondNumberEntered = readln().toInt()

    print("Правильный ответ: 7 и 56. Нажмите клавишу \"ENTER\" чтобы продолжить")
    val useEnter = readln()

    if (
        firstNumberEntered == FIRST_CORRECT_NUMBER && secondNumberEntered == SECOND_CORRECT_NUMBER ||
        firstNumberEntered == SECOND_CORRECT_NUMBER && secondNumberEntered == FIRST_CORRECT_NUMBER
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if (
        firstNumberEntered == FIRST_CORRECT_NUMBER || firstNumberEntered == SECOND_CORRECT_NUMBER ||
        secondNumberEntered == FIRST_CORRECT_NUMBER || secondNumberEntered == SECOND_CORRECT_NUMBER
    )
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
}