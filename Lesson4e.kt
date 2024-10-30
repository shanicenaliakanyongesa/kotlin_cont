fun main() {
       //Nested For Loops
       //In this Code, For every time First Loop Runs, The Nested/Inner Loop Run 5 Times
       for(i in 1..5){
           println("FIRST LOOP: "+i)
           for(x in 1 .. 5){
               println("SECOND LOOP "+x)
           }//end Second/Inner Loop
       }//end  First Loop
}//end