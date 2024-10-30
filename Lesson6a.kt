//Create a Person Object.
class Person {
    //Properties
    var name = "John"
    var age=39
    var height= 1.4

    //Member Functions
    // in speak and eat function we also access a property name.
    fun speak(){
        println("A Person $name Can Speak.")
    }//end

    fun eat(){
        println("A Person $name Can Eat.")
    }//end
}//end Class.

fun main() {
     //Create an Object using Person Class and Store it in myobject variable
     var myobject = Person()

     //use myobject to access member functions and properties
     //Access Function
     myobject.speak()
     
     //Access Property name
     println("The name of the Person is: "+myobject.name)
}//end

