package Lesson_11

class Member(
    var avatarsOfUser: String,
    var participant: String,
    var status: String = "микрофон выключен",
) {
//    fun determineTheStatus(q:Int){
//        if (q==1) status = "разговаривает"
//        else if (q==2) status= "микрофон выключен"
//        else status = "пользователь заглушен"
//    }
}

class Room(avatar: List<String>, participants: List<String>, status: List<String>) {
    val cover = "cover_image.png"
    val name = "Комнаты"
    val avatarsOfUsers = avatar
    val listParticipants = participants
    val listStatus = status

//    fun addToArray(r: String){
//        avatarsOfUsers.add(r)
//    }

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
    val dima = Member("аватар Димы", "Дима")
    val dasha = Member("аватар Даши", "Даша")
    val kolya = Member("аватар Коли", "Коля")
    val leha = Member("аватар Лехи", "Леха")

    val listParticipantsAva = listOf(dasha.avatarsOfUser, dima.avatarsOfUser, kolya.avatarsOfUser, leha.avatarsOfUser)
    val listParticipants = listOf(dasha.participant, dima.participant, kolya.participant, leha.participant)
    val listStatus = listOf(dasha.status, dima.status, kolya.status, leha.status)

    val room = Room(listParticipantsAva, listParticipants, listStatus)

//    room.addToArray(dima.avatarsOfUsers)
//    room.addToArray(dasha.avatarsOfUsers)
//    room.addToArray(kolya.avatarsOfUsers)
//    room.addToArray(leha.avatarsOfUsers)

    room.printInformation()
    println()
    room.displayNames()
}