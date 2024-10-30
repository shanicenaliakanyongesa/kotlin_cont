// below application uses Function with Parameters.file
// The Function accepts age and finds How much to Pay based on Age.file
// To be Done First without Parameters, Then parameter is introduced
// With Parameter when Function is Called Twice you can Provide different argument.
fun main() {
    // Call functions, Providing required arguments.
    AddNumbers(num1=10, num2=56)
    BMI(weight=89.0, height=1.8)
} // end main()

//Below num1 and num2 are parameters
fun AddNumbers(num1:Int, num2:Int){
     val answer = num1 + num2
     println("Your Addition is: "+answer)
}//end

//Below weight and height are parameters
fun BMI(weight: Double, height: Double){
    var answer  = weight/(height * height)
    println("Your Body Mass Index is "+answer)
}//end