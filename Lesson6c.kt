//Fish Class
open class Fish {
    //Data members - Properties
    //....
    val name: String = "Fish name goes here"

    //Member Function
    fun swim(){
        println("Fish Swims")
    }//end

    fun jump(){
        println("Fish Jumps")
    }//end
}//end


//Tilapia Class, Inherits from the Fish.
class Tilapia : Fish() {
   //Member Functions
   fun eating(){
       println("Fish is Eating")
   }//end
}//end


//Create the Tilapia Object in main method
fun main() {
    //create Tilapia Object
    val myobject = Tilapia()
    
    //Access eating function
    myobject.eating()

    //Since Tilapia inherits from Fish, we can access jump() and swim() using Tilapia Object.
    //NB: swim() and jump() are not in Tilapia Class but Fish class.
    //Because of inheritance, we can them as below
    myobject.swim()
    myobject.jump()
}//end