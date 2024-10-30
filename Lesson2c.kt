fun main() {
    val age: Double = 2.0
    val weight: Double = 56.4
    // below when we have if inside another if , its said to be nested
    if (age <= 18) {
        if (weight >= 50) {
            println("You can donate blood")
        } else {
            println("You can't donate blood")
        }
    } // end first if
    else {
        println("You are Over 18")
    }
}
