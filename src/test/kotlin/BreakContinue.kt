//fun main() {
//    // break
//    var i = 0
//    while (i < 10) {
//        println(i)
//        i++
//        if (i == 4) {
//            break
//        }
//    }
//}


fun main() {
    // continue
    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }
}