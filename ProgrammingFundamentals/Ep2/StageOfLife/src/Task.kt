import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    if (age >= 60) {
        return "Old age"
    } else if (age >= 18) {
        return "Adulthood"
    } else if (age >= 12) {
        return "Teenage"
    } else if (age >= 3) {
        return "Childhood"
    } else {
        return "Infancy"
    }
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}