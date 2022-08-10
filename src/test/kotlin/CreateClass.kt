class CreateClass {
    var brand = ""
    var model = ""
    var year = 0
}

//fun main() {
//    val c1 = Car()
//    c1.brand = "Ford"
//    c1.model = "Mustang"
//    c1.year = 1969
//
//    println(c1.brand)
//    println(c1.model)
//    println(c1.year)
//}

fun main() {
    val c1 = CreateClass()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    val c2 = CreateClass()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    println(c1.brand)  // Ford
    println(c2.brand)  // BMW
}



