package AoC21day2

class NewSolution {

    fun getFinalPosition(list: List<String>): Int{ //det var ju mycket smartare att returnera en Int direkt från funktionen, istället för att returnera en Unit https://github.com/asm0dey/aoc-2021/blob/main/src/Day02.kt
        var depth = 0 //andras lösningar var snarlika men tyckte att de krånglade till det för mycket... se https://github.com/soodssr/aoc-2021-kotlin/blob/main/src/Day02.kt
        var horizontal = 0 //däremot inspirerades jag från ovanstående kod att "splitta" strängen i egen funktion!
        var aim = 0
        for (String in list){
            when {
                String.contains("forward") -> {
                    horizontal += splitString(String)
                    depth += aim*splitString(String)
                }
                String.contains("down") -> {
                    aim += splitString(String)
                }
                String.contains("up") -> {
                    aim += - splitString(String)
                }
                else -> {
                    println("some bad positioning going on here")
                }
            }

        }
        return depth * horizontal
    }
    fun splitString(string: String) = string.split(" ")[1].toInt() //eget påfund med inspiration från https://github.com/soodssr/aoc-2021-kotlin/blob/main/src/Day02.kt

}