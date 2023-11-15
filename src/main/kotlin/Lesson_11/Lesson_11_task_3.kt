package Lesson_11

class Member(
    val avatarsOfUser: String,
    val participant: String,
    status: List<String> = listOf(
        "разговаривает",
        "микрофон выключен",
        "пользователь заглушен"
    ),
) {
    val badge: String = status[status.indices.random()]
}

class Room(
    private val cover: String,
    private val name: String,
    private val members: List<Member>
) {
    fun printInformation() {
        println(cover)
        println(name)
        members.forEach { println(it.avatarsOfUser) }
    }
}

fun main() {
    val member1 = Member("аватар Димы", "Дима")
    val member2 = Member("аватар Даши", "Даша")
    val member3 = Member("аватар Коли", "Коля")
    val member4 = Member("аватар Лехи", "Леха")

    val room = Room("cover_image.png", "любители кошек", listOf(member1, member2, member3, member4))

    room.printInformation()

    println("Удерживайте аватар, чтобы отобразилась информация о участнике (введите данные):")
    val enteredDate = readln()

    when (enteredDate) {
        member1.avatarsOfUser -> println("Имя участника: ${member1.participant}; его статус: ${member1.badge}")
        member2.avatarsOfUser -> println("Имя участника: ${member2.participant}; его статус: ${member2.badge}")
        member3.avatarsOfUser -> println("Имя участника: ${member3.participant}; его статус: ${member3.badge}")
        member4.avatarsOfUser -> println("Имя участника: ${member4.participant}; его статус: ${member4.badge}")
    }
}