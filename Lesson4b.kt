fun main() {
     val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

     // Print the Items by Indexing, We count array from index 0
     print(cars[0])   //Prints Volvo
     print(cars[3])   //Prints Mazda

     //Update Item by Index, we update item at index 3(Mazda to Toyota)
     cars[3] = "Toyota"

     //We can print again item at index 3 and its updated.
     println() //Break
     print(cars[3]) //Prints Toyota


     //Finding Array Size
     println() //Break
     print(cars.size)  //Prints 4

     println()  //Break

     //Looping through Text
     var text = "Amazing"
     //Lets loop through Text
     for(letter in text){
         println(letter) //Print each letter as it Loops
     }
}