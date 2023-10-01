package Lesson_5

fun main() {
    print("Испытай удачу! Угадай первое число от 1 до 100: ")
    val firstNumberEntered = readln().toInt()
    print("Испытай удачу! Угадай второе число от 1 до 100: $firstNumberEntered, ")
    val secondNumberEntered = readln().toInt()

    val firstCorrectNumber = (1..100).random()
    var secondCorrectNumber = (1..100).random()

    while (secondCorrectNumber == firstCorrectNumber) secondCorrectNumber = (1..100).random()

    print(
        "Правильный ответ: $firstCorrectNumber и $secondCorrectNumber. Нажмите клавишу \"ENTER\" чтобы продолжить"
    )
    val useEnter = readln()

    if (
        firstNumberEntered == firstCorrectNumber && secondNumberEntered == secondCorrectNumber ||
        firstNumberEntered == secondCorrectNumber && secondNumberEntered == firstCorrectNumber
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if (
        firstNumberEntered == firstCorrectNumber || firstNumberEntered == secondCorrectNumber ||
        secondNumberEntered == firstCorrectNumber || secondNumberEntered == secondCorrectNumber
    )
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
}