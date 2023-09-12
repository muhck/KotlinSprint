package Lesson_2

fun main() {
    val numberOfStaff = 50
    val staffSalaries = 30000
    val newStaff = 30
    val salaryOfNewStaff = 20000

    val allStaffSalaries = numberOfStaff * staffSalaries
    val overAllStaffSalaries = allStaffSalaries + (newStaff * salaryOfNewStaff)
    val averageSalary = overAllStaffSalaries / (numberOfStaff + newStaff)

    println("Расходы на зарплату постоянных сотрудников: ${allStaffSalaries}руб.")
    println("Общие расходы на зарплату всех сотрудников: ${overAllStaffSalaries}руб.")
    println("Средняя зарплата от общего количества всех сотрудников: ${averageSalary}руб.")
}