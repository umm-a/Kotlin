package VG
    fun main() {
        val mapOfAll = mutableMapOf("Tomten" to listOf("Glader", "Butter"), "Glader" to listOf("Tröger", "Trötter", "Blyger"),
            "Butter" to listOf("Haren", "Rådjuret", "Nyckelpigan", "Räven"), "Räven" to listOf("Myran", "Gråsuggan"),
            "Trötter" to listOf("Skumtomten"), "Skumtomten" to listOf("Dammråttan"), "Myran" to listOf("Bladlusen"))
        val t = Tomteland()
        println("\nTomtens:")
        val listTomten = t.getUnderlings("Tomten", mapOfAll)
        listTomten.forEach{ println(it)}
        println("\nRävens: ")
        t.getUnderlings("Räven", mapOfAll).forEach{ println(it) }
        println("\nButters: ")
        t.getUnderlings("Butter", mapOfAll).forEach{ println(it) }
    }
    class Tomteland {
        fun getUnderlings(currentName: String, res: MutableMap<String, List<String>>): List<String> {
            var list = mutableListOf<String>()
            res[currentName]?.forEach { list.add(it)
                if(!res[it].isNullOrEmpty()) list += getUnderlings(it, res) }
            return list
            throw UnsupportedOperationException()
        }
}