import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    var musbat = 0

    if (a>0){
        musbat+=1
    }
    if (b>0){
        musbat+=1
    }
    if (c>0){
        musbat+=1
    }

    println(musbat)

}
