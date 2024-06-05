import com.faangx.ktp.ext.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {
    for (k in 0..n) {
        val coefficient = combinationsOf(n, k)
        val powerA = n - k
        val powerB = k

        if (coefficient > 1) print("$coefficient")

        if (powerA > 0) {
            print("a")
            if (powerA > 1) print("^$powerA")
        }
        if (powerB > 0) {
            print("b")
            if (powerB > 1) print("^$powerB")
        }
        if (k < n) print(" + ")
    }
}

fun factorialOf(x: Int): Int {
    var fact = 1
    for (i in 1..x) {
        fact *= i
    }
    return fact
}

fun permutationsOf(n: Int, r: Int): Int {
    var permutation = 1
    for (i in (n - r + 1)..n) {
        permutation *= i
    }
    return permutation
}

fun combinationsOf(n: Int, r: Int): Int {
    return permutationsOf(n, r) / factorialOf(r)
}

fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}