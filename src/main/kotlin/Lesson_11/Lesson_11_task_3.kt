package Lesson_11

class Room(
    val cover: String,
    val name: String,
    val listParticipants: List<String>,
    val arrayParticipantStatus: Array<String> = arrayOf(
        "\"разговаривает\"", "\"микрофон выключен\"", "\"пользователь заглушен\""
    ),
) {
    fun startInformation() {
        println("Выводим обложку \"$cover\"")
        println("Название комнаты: $name")
        println("Список участников: ${listParticipants.joinToString(", ")}")
    }
}

fun main() {
    val room1 = Room(
        cover = "какая-то картинка",
        name = "любители кошек",
        listParticipants = listOf("Дима", "Николай", "Маша"),
    )

    room1.startInformation()
}