//class Car(var brand: String, var model: String, var year: Int) {
//    // Class function
//    fun drive() {
//        println("Wrooom!")
//    }
//}
//
//fun main() {
//    val c1 = Car("Ford", "Mustang", 1969)
//
//    // Call the function
//    c1.drive()


class Car {
    var brand: String
    var model: String
    var year: Int

    constructor(brand: String, model: String, year: Int) {
        this.brand = brand
        this.model = model
        this.year = year
    }

    // Class function
    fun drive() {
        println("Wrooom!")
    }

    // Class function with parameters
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)

    // Call the functions
    c1.drive()
    c1.speed(200)
}