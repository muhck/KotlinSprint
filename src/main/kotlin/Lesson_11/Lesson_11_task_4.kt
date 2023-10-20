package Lesson_11

class Dish(
    val name: String,
    val category: String,
    val cover: String,
    val ingredients: List<String>,
) {}

class Screen(
    val cover: String,
    val name: String,
    val dish: List<Dish>
) {
    fun openFavoritesScreen() {
        println(cover)
        println(name)
        dish.forEach { println("${it.name} ${it.cover}") }
    }
}

fun main() {
    val dish = Dish(
        "классический гамбургер",
        "бургеры",
        "cover_image.png",
        listOf("булка", "салат", "котлета", "сыр", "соус", "помидор"),
    )

    val dish2 = Dish(
        "чизбургер",
        "бургеры",
        "cover_image.png",
        listOf("булка", "огурцы", "котлета", "сыр", "соус", "помидор", "кетчуп"),
    )

    val dish3 = Dish(
        "бургер с грибами и сыром",
        "бургеры",
        "cover_image.png",
        listOf("булка", "лук", "котлета", "сыр", "соус", "помидор"),
    )

    val screenFavorites = Screen(
        "cover_image.png",
        "избранное",
        listOf(dish, dish2, dish3)
    )

    screenFavorites.openFavoritesScreen()
}