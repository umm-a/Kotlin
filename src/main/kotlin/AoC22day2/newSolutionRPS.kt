package AoC22day2
//Jag kände mig nöjd med min lösning, undrar dock om jag missförstod lite. Räknade personligen ut vad poängen blev i B-delen, vilket man kanske borde skrivit en metod till?
class newSolutionRPS (lines: List<String>) {//https://github.com/ephemient/aoc2022/blob/main/kt/src/commonMain/kotlin/com/github/ephemient/aoc2022/Day2.kt lösningen är copy-paste:ad. Kommenterar nedan vad som sker för att visa att jag förstår...
    private val inputs = lines.map { it[0] - 'A' + 1 to it[2] - 'X' + 1 } //Denna gör om värdena A, B, C till poängen 1, 2, 3 samt X, Y, Z till 1, 2, 3
        val printLines = inputs.forEach{ println(it) } //denna lade jag till själv för att se vad ovanstående rad gör...
        fun part1(): Int = inputs.sumOf { (first, second) -> score(first, second) } //slår ihop resultatet för varje input

        fun part2(): Int = inputs.sumOf { (first, second) -> score(first, 1 + (first + second).mod(3)) } //A, B, C ska ha kvar samma värden (first) men second ändras - mod är som %-operatorn i Java.
        // För (C, X) där X = (1 + 6) från min uträkning som jag skrev om till (2 + 0) i B-lösningen räknas i den nya lösningen ut till: (1 + (1 + 6).mod(3)) = (1 + 1) = 2 (och sedan skickas den till till score-delen)
        private fun score(first: Int, second: Int): Int = (1 + second - first).mod(3) * 3 + second // För (C, X) i B-delen (1 + 2 - 3).mod(3) * 3 + 2 = 2
        // Samma resultat men på två väldigt olika vis... Jag tänkte för hand (vilket inte är att rekommendera för större uträkningar) medan denne individ kom på en matematisk beräkning.
}