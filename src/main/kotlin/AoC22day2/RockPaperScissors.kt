package AoC22day2

class RockPaperScissors {
    fun points(list: List<String>): Int {
        var points = 0
            list.forEach{ when (it) {
                "A X" -> points += 1 + 3 //A=rock, B=paper, C=scissors
                "A Y" -> points += 2 + 6 //X=rock, Y=paper, Z=scissors
                "A Z" -> points += 3 + 0
                "B X" -> points += 1 + 0
                "B Y" -> points += 2 + 3
                "B Z" -> points += 3 + 6
                "C X" -> points += 1 + 6
                "C Y" -> points += 2 + 0
                "C Z" -> points += 3 + 3
            }}
        return points
    }
    fun truePoints(list: List<String>): Int {
        var points = 0
        list.forEach{ when (it) {
            "A X" -> points += 3 + 0//A=rock, B=paper, C=scissors
            "A Y" -> points += 1 + 3 //A=rock, B=paper, C=scissors
            "A Z" -> points += 2 + 6
            "B X" -> points += 1 + 0 //Y=draw 3p, X=loss 0p, Z=win 6p
            "B Y" -> points += 2 + 3
            "B Z" -> points += 3 + 6
            "C X" -> points += 2 + 0
            "C Y" -> points += 3 + 3
            "C Z" -> points += 1 + 6
        }}
        return points
    }
}