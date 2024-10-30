fun main() {

    val age: Int = 42
    // Explain If-First Condition
    if (age < 10) {
        println("You're too young to watch this movie")
    }

    // Explain Else If-Second Condition
    else if (age < 13) {
        println("You can watch this movie with a parent")
    }

    // Explain Else  - Last Option when all conditions are False, This execute
    else {
        println("You can watch this movie")
    }
}
