fun main(args: Array<String>) {
    var marks: Int = 10 //we set some marks here
    when(marks){
    in 1..30 -> {
    //assume we need to multiply marks by 2
    println("You have $marks - Below average") 
    var new: Int = marks * 2
    println("You have new marks is $new")
    }
    
    in 31..50 -> println("You have $marks - Average")
    in 51..75 -> println("You have $marks - Above average")
    in 76..99 -> println("You have $marks - Excellent")
    else -> println("You have $marks - Invalid Marks try again")
    
    }
   }