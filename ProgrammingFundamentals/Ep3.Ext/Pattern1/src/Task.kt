import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {

    for (i in 1..lines)  {
        for (j in 1..lines) {
            print(if (i == j) char1 else char2)
        }
        println()
    }
    /*repeat(lines) { i ->
        repeat(lines) { j ->
            print(if (i == j) char1 else char2)
        }
        println()
    }*/

}

fun main() {
    PatternMiniApp("P1", ::printPattern)
}