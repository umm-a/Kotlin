import VG.Tomteland
import junit.framework.TestCase.assertFalse
import org.junit.Test

class VGTest {
    val mapOfAll = mutableMapOf("Tomten" to listOf("Glader", "Butter"), "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Butter" to listOf("Haren", "Rådjuret", "Nyckelpigan", "Räven"), "Räven" to listOf("Myran", "Gråsuggan"),
        "Trötter" to listOf("Skumtomten"), "Skumtomten" to listOf("Dammråttan"), "Myran" to listOf("Bladlusen"))
    private val t = Tomteland()

    @Test
    fun getTomtens(){
        assert(t.getUnderlings("Tomten", mapOfAll).size==14)
        assert(t.getUnderlings("Tomten", mapOfAll).contains("Bladlusen"))
        assert(t.getUnderlings("Tomten", mapOfAll).contains("Blyger"))//stickprov, Tomten har 14 st...
    }
    @Test
    fun getGladers(){
        assert(t.getUnderlings("Glader", mapOfAll).size==5)
        assertFalse(t.getUnderlings("Glader", mapOfAll).contains("Bladlusen"))
        assert(t.getUnderlings("Glader", mapOfAll).contains("Blyger"))
        assert(t.getUnderlings("Glader", mapOfAll).contains("Trötter"))
        assert(t.getUnderlings("Glader", mapOfAll).contains("Dammråttan"))
    }
    @Test
    fun getButters(){
        assert(t.getUnderlings("Butter", mapOfAll).size==7)
        assert(t.getUnderlings("Butter", mapOfAll).contains("Bladlusen"))
        assert(t.getUnderlings("Butter", mapOfAll).contains("Haren"))
        assert(t.getUnderlings("Butter", mapOfAll).contains("Nyckelpigan"))
        assert(t.getUnderlings("Butter", mapOfAll).contains("Rådjuret"))
        assertFalse(t.getUnderlings("Butter", mapOfAll).contains("Tröger")) //OBS False
    }
    @Test
    fun getRävens(){
        assert(t.getUnderlings("Räven", mapOfAll).size==3)
        assert(t.getUnderlings("Räven", mapOfAll).contains("Bladlusen"))
        assert(t.getUnderlings("Räven", mapOfAll).contains("Myran"))
    }
    @Test
    fun getMyrans(){
        assert(t.getUnderlings("Myran", mapOfAll).size==1)
        assert(t.getUnderlings("Myran", mapOfAll).contains("Bladlusen"))
        assertFalse(t.getUnderlings("Myran", mapOfAll).contains("Blyger")) //OBS False
    }
}