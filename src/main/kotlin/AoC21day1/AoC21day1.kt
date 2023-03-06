import AoC21day1.Increaser
import AoC21day1.IntListFromFile

//y2021d01
fun main(){
    val listMakerClass = IntListFromFile()
    val list = listMakerClass.getIntList("C:\\javamapp\\Kotlin_AoC\\src\\main\\kotlin\\AoC21day1\\AoC21day1File")
    val increaser = Increaser()
    println(increaser.timesIncreased(list))
    println(increaser.timesIncreasedSummarized(list))
}