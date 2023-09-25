package Lesson_4

fun main() {
    print("Имеет ли корабль повреждения: ")
    val isDamaged = readlnOrNull().toBoolean()
    print("Текущий состав экипажа: ")
    val crewComposition = readln().toInt()
    print("Количество ящиков с провизией на борту: ")
    val provisionsOnBoard = readln().toInt()
    print("Благоприятна ли погода: ")
    val isSunny = readlnOrNull().toBoolean()

    if (!isDamaged && crewComposition >= 55 && crewComposition <= 70 && provisionsOnBoard > 50)
        println("Научно-исследовательский корабль может приступить к долгосрочному плаванию")
    else if (crewComposition == 70 && provisionsOnBoard > 50 && isSunny == true)
        println("Научно-исследовательский корабль может приступить к долгосрочному плаванию")
    else
        println("Научно-исследовательский корабль не может приступить к долгосрочному плаванию")
}