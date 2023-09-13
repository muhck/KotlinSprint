package Lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20

    val buffedCrystalOre = (crystalOre * buff) / 100
    val buffedIronOre = (ironOre * buff) / 100

    println("Добытая кристалическая руда при помощи 20% баффа: ${buffedCrystalOre}ед")
    println("Добытая железная руда при помощи 20% баффа: ${buffedIronOre}ед")
}