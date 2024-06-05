import com.faangx.ktp.patterns.single.PatternLinesAndCharBasedMiniApp

fun printPattern(lines: Int, char: Char) {
    repeat(lines) {
        repeat(lines - 1 - it) { print(" ") }
        repeat(it + 1) { print(char) }
        println()
    }
    /*for (i in 0 until lines) {
        // spaces
        for (j in 0 until lines - 1 - i) {
            print(" ")
        }
        // characters
        for (j in 0..i) {
            print(char)
        }
        println()
    }*/
}

fun main() {
    PatternLinesAndCharBasedMiniApp("BR", ::printPattern)
}