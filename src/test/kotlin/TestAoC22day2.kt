import AoC22day2.RockPaperScissors
import AoC22day2.newSolutionRPS
import org.junit.Test

class TestAoC22day2 {
    @Test
    fun rpsTest(){
        var list = listOf("A Y","B X","C Z")
        var rps = RockPaperScissors()
        assert(rps.points(list)==15)
        println(rps.points(list))
        println(rps.truePoints(list))
        assert(rps.truePoints(list)==12)
    }

    @Test
    fun newSolution(){
        var list = listOf("A Y","B X","C Z")
        var new = newSolutionRPS(list)
        assert(new.part1()==15)
        assert(new.part2()==12)
    }
}