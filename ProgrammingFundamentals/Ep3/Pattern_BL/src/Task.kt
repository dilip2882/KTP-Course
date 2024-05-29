import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char: Char) {
    for (i in 1..lines) {
        repeat(i) {
            print(char)
        }
        println()
    }
  /*  repeat(lines) {
        repeat(it + 1) {
            print(char)
        }
        println()
    }*/
}

fun main() {
    PatternMiniApp("BL", ::printPattern)
}