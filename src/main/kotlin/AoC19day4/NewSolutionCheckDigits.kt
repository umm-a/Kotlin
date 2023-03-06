package AoC19day4
//Ny version (ej min, enbart "städat" lite onödig it.toInt som ej behövdes, samt skickar in min lista i två metoder
class NewSolutionCheckDigits(input: List<String>) {

        private fun has5DistinctNumbers(it: Int) = it.toString().toSet().size < 6 //om 6 -> ej två lika eftersom vi använder toSet() och vår size är 6

        private fun hasAllIncreasingDigits(it: Int) =
            it.toString()
                .map { it }//personen hade skrivit it.toInt() men det behövs just ej
                .windowed(2, 1)
                .all { (a, b) -> b >= a }

        private fun hasAtLeastOneDigitAppearingExactlyTwice(it: Int) =
            it.toString()
                .groupBy { it }//likt vad jag gjorde! Jag gjorde eachCount() och contains(2), medan denne mappade med storlek och använde any() istället för att fixa B-delen
                .mapValues { (k, v) -> v.size }
                .any { (k, v) -> v == 2 }

        fun part1(input: List<String>) =
            input.asSequence()
                .filter { hasAllIncreasingDigits(it.toInt()) && has5DistinctNumbers(it.toInt()) }
                .count()
    //jag anropar från main...list.count { neverDecreases(it) && hasTwoOfTheSame(it) }
        fun part2(input: List<String>) =
            input.asSequence()
                .filter { hasAllIncreasingDigits(it.toInt()) && hasAtLeastOneDigitAppearingExactlyTwice(it.toInt()) }
                .count()

}
