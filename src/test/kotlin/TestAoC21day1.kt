import AoC21day1.Increaser
import AoC21day1.IntListFromFile
import junit.framework.TestCase.assertFalse
import org.junit.Test

class TestAoC21day1 {
    @Test
    fun testTimesIncreased() {
        val numbersList = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        val increaser = Increaser()
        assert(increaser.timesIncreased(numbersList)==7)
        assertFalse(increaser.timesIncreased(numbersList)==4)
    }

    @Test
    fun testIntListFromFile(){
        val listFunction = IntListFromFile()
        assert(listFunction.getIntList("C:\\javamapp\\Kotlin_AoC\\src\\main\\kotlin\\AoC21day1\\AoC21day1File").contains(345))
    }

    @Test
    fun testTimesIncreasedSummed() {
        val numbersList = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        val increaser = Increaser()
        assert(increaser.timesIncreasedSummarized(numbersList)==5)
    }
    @Test
    fun newTestTimesIncreased() {
        val numbersList = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        val increaser = Increaser()
        assert(increaser.newTimesIncreased(numbersList)==7)
    }

    @Test
    fun newTestTimesIncreasedSummed() {
        val numbersList = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        val increaser = Increaser()
        assert(increaser.newTimesIncreasedSummarized(numbersList)==5)
    }


}