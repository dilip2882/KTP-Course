import com.faangx.ktp.patterns.single.PatternLinesBasedMiniApp

fun printPattern(lines: Int) {
    repeat(lines) {i ->
        repeat(lines - i) { print(lines - i) }
        println()
    }
    /*for (i in 0 until lines) {
        // numbers
        for (j in 0 until lines - i) {
            print(lines - i)
        }
        println()
    }*/

}

fun main() {
    PatternLinesBasedMiniApp("TLN", ::printPattern)
}