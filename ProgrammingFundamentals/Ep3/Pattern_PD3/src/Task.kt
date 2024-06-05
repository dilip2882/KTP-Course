import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines) { i ->
        // space
        repeat(i) { print(" ") }

        // char
        repeat(2 * (lines - i) - 1) { j ->
            print(
                if (j % 2 == 0) char1 else char2
            )
        }

        // line break
        println()
    }

}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("PD3", ::printPattern)
}