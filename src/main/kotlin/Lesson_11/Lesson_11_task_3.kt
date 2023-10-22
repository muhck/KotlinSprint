package Lesson_11

class Member(
    var avatarsOfUser: List<String>,
    var participant: List<String>,
    var status: List<String>,
)

class Room(avatar: List<String>, participants: List<String>, status: List<String>) {
    private val cover = "cover_image.png"
    private val name = "Комнаты"
    private val avatarsOfUsers = avatar
    private val listParticipants = participants
    private val listStatus = status

    fun printInformation() {
        println(cover)
        println(name)
        println(avatarsOfUsers.joinToString(", "))
    }

    fun displayNames() {
        println("Удерживайте аватар, чтобы отобразилась информация о участнике (введите данные):")
        val enteredDate = readln()
        for (i in avatarsOfUsers.indices) {
            if (avatarsOfUsers[i] == enteredDate) {
                println(
                    """"Имя участника - ${listParticipants[i]}
                        |Его статус - ${listStatus[i]}
                    """.trimMargin()
                )
            }
        }

    }
}

fun main() {
    val member = Member(
        listOf("аватар Димы", "аватар Даши", "аватар Коли", "аватар Лехи"),
        listOf("Дима", "Даша", "Коля", "Леха"),
        listOf("разговаривает","микрофон выключен","микрофон выключен","пользователь заглушен")
    )

    val room = Room(member.avatarsOfUser, member.participant, member.status)

    room.printInformation()
    println()
    room.displayNames()
}