import AoC21day1.Increaser
import AoC21day1.IntListFromFile
import AoC22day1.Calories
import org.junit.Test

class TestAoC22day1 {

    @Test
    fun testMostCalories(){
        val cal = Calories()
        val path = "C:\\javamapp\\Kotlin_AoC\\src\\test\\kotlin\\caloriesFile"
        assert(cal.findMaxInList(cal.listedCaloriesList(path))==24000)
        assert(cal.find3MaxInList(cal.listedCaloriesList(path))==45000)
    }

    @Test
    fun testRefinement(){
        val cal = Calories()
        val path = "C:\\javamapp\\Kotlin_AoC\\src\\test\\kotlin\\caloriesFile"
     //   assert(cal.findMaxInList(cal.listedCaloriesList2(path))==24000)
        assert(cal.find3MaxInList2(cal.listedCaloriesList2(path))==45000)
    }
}