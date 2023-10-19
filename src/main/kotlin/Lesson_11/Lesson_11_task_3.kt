package Lesson_11

class Room(
    val cover: String = "какая-то картинка",
    val name: String = "любители кошек",
    val avatarsOfUsers: List<String> = listOf("аватар Димы", "аватар Николая", "аватар Маши"),
    val listParticipants: List<String> = listOf("Дима", "Николай", "Маша"),
    val talking: String = "\"разговаривает\"",
    val microphoneOff: String = "\"микрофон выключен\"",
    val userSilent: String = "\"пользователь заглушен\"",
) {
    fun printInformation() {
        println("Выводим обложку \"$cover\"")
        println("Название комнаты: $name")
        println("Аватарки участников: ${avatarsOfUsers.joinToString(", ")}")
    }

    fun displayNames() {
        println("Удерживайте аватар, чтобы отобразилась информация о участнике (введите данные):")
        val enteredDate = readln()
        for (i in avatarsOfUsers.indices) {
            if (avatarsOfUsers[i] == enteredDate) {
                println(
                    """""Вывелось имя участника" - ${listParticipants[i]}
                        |"Вывелся его статус" - $talking
                    """.trimMargin()
                )
            }
        }

    }
}

fun main() {
    val room = Room()
    room.printInformation()
    println()
    room.displayNames()
}