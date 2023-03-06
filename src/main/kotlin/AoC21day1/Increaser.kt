package AoC21day1

class Increaser {
    fun timesIncreased(list: List<Int>): Int{
        var i = 0
        for((index, element) in list.withIndex()){
            if(index==0) //do nothing
            else if(element > list[index-1])
                i++
        }
        return i
    }

    fun timesIncreasedSummarized(list: List<Int>): Int{
        var y = 0
        for(i in 0 until list.size-3){
            if((list[i]+list[i+1]+list[i+2]) < (list[i+1]+list[i+2]+list[i+3])){
                y++
            }
        }
        return y
    }
//Nytt:
    fun newTimesIncreased(list: List<Int>): Int{
        return list.map { it }.zipWithNext().count{ it.first < it.second}// inspiration från lektionstid då Robin visade sin kod
    }
    fun newTimesIncreasedSummarized(list: List<Int>): Int{
       // return list.windowed(3){ it.sum() }.zipWithNext().count{ it.first < it.second} //lösningen online som jag inspirerats av / tagit, där gjordes däremot listan om till Int i map på samma rad (och jag skickar in Int direkt i listan)
        return list.windowed(3){ it.sum() }.zipWithNext().count{ (first, second) -> first < second} //det går alltså att plocka ut de två elementen "som vanligt" när man skriver en lambda, det blev min skillnad
    }
}