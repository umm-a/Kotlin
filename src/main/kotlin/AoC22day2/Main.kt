package AoC22day2

import java.io.File

fun main() {
    var rps = RockPaperScissors()
    var path = "C:\\javamapp\\Kotlin_AoC\\src\\main\\kotlin\\AoC22day2\\rpsInput"
    var list = getList(path)
    println(rps.points(list))
    println(rps.truePoints(list))

    val n = newSolutionRPS(list)
   // println(n.part1())
  //  println(n.part2())
    n.printLines
}
fun getList(pathName: String): List<String> {
    var list = ArrayList<String>()
    try {
        File(pathName).forEachLine { list.add(it)}
    } catch (e:Exception){
        println("path, come again?")
    }
    return list
}