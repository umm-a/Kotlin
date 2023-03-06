package AoC22day1
import java.io.File
import java.lang.Exception

class Calories {
    fun listedCaloriesList(path: String): MutableList<Int>{
        val caloriesTotal = mutableListOf<Int>()
        var i = 0
        var tempSum = 0
        try{
            File(path).forEachLine { if(it.isNotBlank()){ tempSum += it.toInt() } //lade till två blanka rader för att få med det sista värdet också
            else {
                i++
                caloriesTotal.add(tempSum)
                tempSum = 0
            } }
        } catch (e: Exception){
            println("This is an exceptional exception")
        }
        return caloriesTotal
    }

    fun findMaxInList(list: MutableList<Int>): Int{
        return list.max()
    }

    fun find3MaxInList(list: MutableList<Int>): Int{
        return list.sorted().takeLast(3).sum()
    }

    //Ny inspirerad av https://todd.ginsberg.com/post/advent-of-code/2022/day1/
    fun listedCaloriesList2(path: String): List<Int> {
        val caloriesTotal = mutableListOf<Int>()
        var i = 0
        var tempSum = 0
        try{
            File(path).forEachLine { if(it.isNotBlank()){ tempSum += it.toInt() } //lade till två blanka rader för att få med det sista värdet också
            else {
                i++
                caloriesTotal.add(tempSum)
                tempSum = 0
            } }
        } catch (e: Exception){
            println("This is an exceptional exception")
        }
        return caloriesTotal.sortedDescending()//skillnaden blir att man kan sortera listan redan här, dock krävdes det att listan var av typen List och ej MutableList
    }
    fun find3MaxInList2(list: List<Int>): Int{
        return list.take(3).sum() //då blir denna rad utan sortering...
    }
}//Fokuserade på att utveckla min egen version, vilket inte gav supermycket. Visserligen skickar jag ej in en string och delar ej upp den genom att splitta och mappa, men tycker faktiskt att min lösning fungerar prima