package AoC22day1

fun main() {
    val c = Calories()
    val path = "C:\\javamapp\\Kotlin_AoC\\src\\main\\kotlin\\AoC22day1\\inputCalories"
    println(c.findMaxInList(c.listedCaloriesList(path)))
    println(c.find3MaxInList(c.listedCaloriesList(path)))
}