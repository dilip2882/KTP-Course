import com.faangx.ktp.basics.MultiplicationTableMiniApp

fun printTable(num: Int) {
    return (1..10).forEach { println("$num x $it = ${num * it}") }
}

fun main() {
    MultiplicationTableMiniApp(::printTable)
}