import AoC21day1.Increaser
import AoC21day2.NewSolution
import AoC21day2.PositionSubmarine
import AoC21day2.TrueSubmarine
import junit.framework.TestCase
import org.junit.Test

class TestAoc21day2 {
    @Test
    fun testPositionA() {
        val positionList = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
        val sub = PositionSubmarine()
        sub.addToPosition(positionList)
        assert(sub.position()==150)
    }
    @Test
    fun testPositionB() {
        val positionList = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
        val sub = TrueSubmarine()
        sub.addToPosition(positionList)
        assert(sub.depth==60)
        assert(sub.horizontal==15)
        assert(sub.getPosition()==900)
    }
    @Test
    fun newFun(){
        val positionList = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
        val result = NewSolution()
        assert(result.getFinalPosition(positionList)==900)
    }

}