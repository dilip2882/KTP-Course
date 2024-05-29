import com.faangx.ktp.basics.MultiplicationTableMiniApp

fun printTable(num: Int) {
    return repeat(10) {
        println("$num x ${it + 1} = ${num * (it + 1)}")
    }
}


fun main() {
    MultiplicationTableMiniApp(::printTable)
}