import com.faangx.ktp.basics.SpiralFullScreenMiniApp

fun printFibonacciSeries(n: Int) {
    var a = 1
    var b = 1
    repeat(n) {
        if (it <= 1) {
            print("1, ")
        } else {
            print("$b, ")
            val nextTerm = a + b
            a = b
            b = nextTerm
        }
    }
}

fun main() {
    SpiralFullScreenMiniApp(
        ::printFibonacciSeries
    )
}