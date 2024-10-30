fun main() {
    // Call Your Functions
    addition()
    multiplication()

} // end

// Lecturer TODO
fun addition() {
    val num1: Double = 6.8
    val num2: Double = 6.2
    val answer: Double = num1 + num2
    println("The total is $answer")
}

// Student TODO
fun multiplication() {
    val num1: Double = 6.8
    val num2: Double = 6.2
    val answer: Double = num1 * num2 
    println("The Product is $answer")
}


// Lecturer TODO - Including if else in a function
fun check() {
    val withdrawal: Int = 1200
    if (withdrawal < 50) {
        println("Not Allowed")
    } else if (withdrawal >= 50) {
        println("You will Pay 3 KES Transaction FEE")
    } else {
        println("You will Pay 10 KES Transaction FEE ")
    }
} // end check()
