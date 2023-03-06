package AoC21day2
//B-delen
class TrueSubmarine {
    var depth = 0
    var horizontal = 0
    fun addToPosition(list: List<String>){
        var aim = 0
        for (String in list){
            when {
                String.contains("forward") -> {
                    horizontal += String.split(" ")[1].toInt()
                    depth += aim*String.split(" ")[1].toInt()
                }
                String.contains("down") -> {
                    aim += String.split(" ")[1].toInt()
                }
                String.contains("up") -> {
                    aim += -String.split(" ")[1].toInt()
                }
                else -> {
                    println("some bad positioning going on here")
                }
            }
        }
    }

    fun getPosition() = depth * horizontal
}