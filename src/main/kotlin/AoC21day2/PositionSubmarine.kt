package AoC21day2
//A-delen
class PositionSubmarine {
    var depth = 0
    var horizontal = 0
    fun addToPosition(list: List<String>){
        for (String in list){
            when {
                String.contains("forward") -> horizontal+=String.split(" ")[1].toInt()
                String.contains("down") -> depth+=String.split(" ")[1].toInt()
                String.contains("up") -> depth+= -String.split(" ")[1].toInt()
                else -> {
                    println("some bad positioning going on here")
                }
            }
        }
    }
    fun position() = depth * horizontal
}