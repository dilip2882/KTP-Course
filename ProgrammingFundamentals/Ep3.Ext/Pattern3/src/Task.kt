import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    for (i in 0 until lines) {
        repeat(lines - i - 1) { print(char2) }
        print(char1)
        repeat(2 * i - 1) { print(char2) }
        if (i != 0) {
            print(char1)
        }
        repeat(lines - i - 1) { print(char2) }
        println()
    }
}


fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P3", ::printPattern)
}