import com.faangx.ktp.patterns.single.PatternLinesAndCharBasedMiniApp

fun printPattern(lines: Int, char: Char) {
    for (i in 0 until lines) {
        repeat(lines - 1 - i) { print(" ") }
        repeat(2 * i + 1) { print(char) }
        println()
    }
}

fun main() {
    PatternLinesAndCharBasedMiniApp("PU1", ::printPattern)
}