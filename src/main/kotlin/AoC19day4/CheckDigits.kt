package AoC19day4
//TODO denna lösning är jag mest stolt över, ty jag listade ut en mer clean code redan från början till skillnad från tidigare uppgifter!
//https://adventofcode.com/2019/day/4
fun neverDecreases(thing: String): Boolean{
    thing.zipWithNext().forEach{ if(it.first > it.second) return false }
    return true
}
fun hasTwoOfTheSame(thing: String): Boolean{
    val set: MutableSet<Char> = mutableSetOf()
    thing.forEach { if (set.contains(it)) return true else set.add(it) }
    return false
}
fun hasTwoOfTheSamePartB(thing: String): Boolean {//här kan man istället skicka in en parameter ofSameKind: Int för att välja containsValue(ofSameKind), för att få en mer dynamisk metod
    return thing.groupingBy { it }.eachCount().containsValue(2) //metodnamnet kan isåfall vara "hasXOfSameKind" eller dylikt - se metod på botten...
}

fun main (){
    var list = mutableListOf<String>()
    for(text in 248345 .. 746315) list.add(text.toString())
   // mutableListOf("123", "312", "456").filter { neverDecreases(it) }.forEach{ println(it) }
    println(list.count { neverDecreases(it) && hasTwoOfTheSame(it) }) //TODO min
    println(list.count { neverDecreases(it) && hasTwoOfTheSamePartB(it) })

    //nya delen:
    val n = NewSolutionCheckDigits(list)
    println(n.part1(list))
    println(n.part2(list))

   // println(part1(list))
}
/*
//Ny version (ej min, enbart "städat" lite onödig it.toInt som ej behövdes, samt skickar in min lista i två metoder
    private fun has5DistinctNumbers(it: Int) = it.toString().toSet().size < 6

    private fun hasAllIncreasingDigits(it: Int) =
        it.toString()
            .map { it }
            .windowed(2, 1) //istället för zipWithNext...
            .all { (a, b) -> b >= a }

    private fun hasAtLeastOneDigitAppearingExactlyTwice(it: Int) =
        it.toString()
            .groupBy { it } //mycket lik min lösning!
            .mapValues { (k, v) -> v.size }
            .any { (k, v) -> v == 2 }

    fun part1(input: List<String>) = //skickar här in min lista
        input.asSequence()
            .filter { hasAllIncreasingDigits(it.toInt()) && has5DistinctNumbers(it.toInt()) }
            .count()

    fun part2(input: List<String>) =
        input.asSequence()
            .filter { hasAllIncreasingDigits(it.toInt()) && hasAtLeastOneDigitAppearingExactlyTwice(it.toInt()) }
            .count()
















// println(listOf("114444", "1234555", "202222", "222233", "111122").count{ neverDecreases(it) && hasXOfSameKind(it, 4) })
fun hasXOfSameKind(thing: String, ofSameKind: Int): Boolean {
    return thing.groupingBy { it }.eachCount().containsValue(ofSameKind)
}*/
