fun main() {
    val numArray = arrayOf(45.3, 67.5, 45.6, 20.34, 33.0, 45.6)
    var sum = 0.0 // Set sum to be zero
    for (num in numArray) {
        sum = sum + num //Update Sum
    }
    println("The SUM is "+sum)
}