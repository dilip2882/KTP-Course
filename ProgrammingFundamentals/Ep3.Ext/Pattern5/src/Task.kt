import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    for (i in 0 until lines / 2) {
        for (j in 0 until lines) {
            if (j == i || j == lines - i - 1) {
                print(char2)
            } else if (j == lines / 2) {
                print(char1)
            } else {
                print(' ')
            }
        }
        println()
    }

    repeat(lines) {
        print(char1)
    }
    println()

    for (i in 0 until lines / 2) {
        for (j in 0 until lines) {
            if (j == (lines / 2 - 1 - i) || j == (lines / 2 + i + 1)) {
                print(char2)
            } else if (j == lines / 2) {
                print(char1)
            } else {
                print(' ')
            }
        }
        println()
    }
}

fun main() {
    PatternMiniApp("P5", ::printPattern)
}