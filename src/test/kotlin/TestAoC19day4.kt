import AoC19day4.hasTwoOfTheSame
import AoC19day4.hasTwoOfTheSamePartB
import AoC19day4.neverDecreases
import org.junit.Test

class TestAoC19day4 {
    @Test
    fun passwordTest(){
        mutableListOf("123", "312", "456").filter { neverDecreases(it) }.forEach{ println(it) }
        assert(mutableListOf("123", "312", "456").filter { neverDecreases(it) }[0]=="123")
        assert(mutableListOf("123", "312", "456").filter { neverDecreases(it) }[1]!="312")
        println(hasTwoOfTheSame("123"))
        println(hasTwoOfTheSame("122"))
        assert(mutableListOf("123", "312", "4556").filter { neverDecreases(it) && hasTwoOfTheSame(it) }[0]=="4556")
        assert(!hasTwoOfTheSamePartB("1234555"))
        assert(hasTwoOfTheSamePartB("123455566"))
        assert(mutableListOf("123", "4555", "11122").filter { neverDecreases(it) && hasTwoOfTheSamePartB(it) }[0]=="11122")
    }

}