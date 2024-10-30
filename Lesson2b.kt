fun main() {
    val marks: Double = 20.0

    if (marks < 30) {
        println("You scored $marks")
        println("Failed")
    } else if (marks >= 30 && marks <= 50) {
        println("You scored $marks")
        println("You have below average ")
    } else if (marks > 50 && marks <= 70) {
        println("You scored $marks")
        println("You have an Average")
    } else if (marks > 70 && marks <= 100) {
        println("You scored $marks")
        println("You have an Above Average")
    } else {
        println("Invalid")
        
    }
} // end
