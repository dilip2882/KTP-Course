import com.faangx.ktp.basics.StringPalindromeCheckerMiniApp

fun isPalindrome(str: String, ignoreCase: Boolean): Boolean {
    if (str == "") return  false
    return areStringsEqual(str, reverseStr(str), ignoreCase)
}

fun reverseStr(str: String): String {
    /*var rev = ""     // inefficient
    for (i in str.lastIndex downTo 0) {
        rev += str[i]
    }*/
    return buildString {
        for (i in str.lastIndex downTo 0) {
            append(str[i])
        }
    }
}

fun areStringsEqual(s1: String, s2: String, ignoreCase: Boolean): Boolean {
    if (s1.length != s2.length) return false

    for (i in s1.indices) {
        if (!areCharsEqual(s1[i], s2[i], ignoreCase)) return false
    }

    return true
}

fun areCharsEqual(c1: Char, c2: Char, ignoreCase: Boolean): Boolean {
    if (!ignoreCase) return  c1 == c2
    return positionInAlphabet(c1) == positionInAlphabet(c2)
//    return convertToLowercase(c1) == convertToLowercase(c2)
}

fun positionInAlphabet(char: Char): Int {
    return when (char) {
        in 'A'..'Z' -> char.code - 'A'.code + 1
        in 'a'..'z' -> char.code - 'a'.code + 1
        else -> char.code
    }
}

/*// alternative
fun convertToLowercase(char: Char): Char {
    return if (char in 'A'..'z') {
        Char(char.code + 32)
    } else {
        char
    }
}*/

fun main() {
    StringPalindromeCheckerMiniApp(
        ::reverseStr,
        ::isPalindrome
    )
}