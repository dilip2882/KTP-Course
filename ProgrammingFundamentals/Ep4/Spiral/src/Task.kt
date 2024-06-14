import com.faangx.ktp.basics.SpiralFullScreenMiniApp

fun main() {
    printFibonacciSeries(10)
}

fun printFibonacciSeries(n: Int) {
    var a = 0
    var b = 1
    repeat(n) {
        println(b)
        val nextTerm = a + b
        a = b
        b = nextTerm
    }
}
