
/* *****************************************
AUTHOR Paul Curzon

A program to demonstrate if  on a boolean value
      Show how the first branch of an if is executed if the test is true

      Try changing the assignment of test to false to see the difference
******************************************** */

import java.util.Scanner; // import the swing library for I/O

class if_boolean
{
    public static void main (String[] param)
    {
        
        boolean test = true; // try changing the true to false - what will happen?
        
        System.out.println("BEFORE the IF execution we execute this statement");                 

        if (test)
        {
           System.out.println("Yes!!! The first branch was executed and the second ignored");        // Executed if the test is true
        }
        else
        {
            System.out.println("I'll bet this message is never printed");       // Executed if the test is false
        }   
        
        System.out.println("After the IF execution jumps here and continues\n (whichever branch was executed)");  

        System.exit(0);
        
    } // END main    

} // END class if_boolean
