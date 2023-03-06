package AoC21day2

import java.io.File

fun getList(pathName: String): List<String> {
    var list = ArrayList<String>()
    try {
        File(pathName).forEachLine { list.add(it) }
    } catch (e:Exception){
        println("path, come again?")
    }
    return list
}

fun main() {
    val positionList = getList("C:\\javamapp\\Kotlin_AoC\\src\\main\\kotlin\\AoC21day2\\Aoc21day2")
    val sub = PositionSubmarine()
    val anothersub = TrueSubmarine()
    sub.addToPosition(positionList)
    anothersub.addToPosition(positionList)
    println(sub.position())
    println(anothersub.getPosition())
}