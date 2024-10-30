
//Create a Class to Find Area
class Square{
   //Data members - Properties
   val width: Int = 3
   val height: Int = 5

   //Member Function.
   fun findArea(){
       val answer = width * height
       println("Area is $answer ")
   }//end

   fun findPerimeter(){
       val answer = (width + height) * 2
       println("Perimeter is $answer")
   }
}//end

val squareA = Square()
println(squareA.findArea())
