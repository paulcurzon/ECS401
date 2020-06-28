
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - integer variables
 - doing calculations.
 
   Ask the user for a number, and perform a simple calculation on it:
   square it and divide by 3. Finally print out the result
******************************************** */

import java.util.Scanner; // Needed to make Scanner available

class calculate
{
    public static void main (String[] param)
    {
        
        squarethird();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       This method asks the user for a number, and performs a simple calculation on it:
       square it and divide by 3. Finally print out the result
    */
    
    public static void squarethird()
    {

       // Declare variables
       //
       String textinput;  // whatever the person types
       int number;        // an integer version of textinput
       int answer;        // the final answer 
       
       // Get some text (a string) from the user then
       // convert (known as parsing) it into a number version
       //
       number = inputNumber();

       // Now do the calculation
       //
       answer = (number * number) / 3;

       // Finally give the user the answer
       //   
       System.out.println("Answer is " + answer);
       
       return;
        
    } // END squarethird
    
    
    /* ***************************************************
       This method gets a single integer from the user and returns it
    */
    
    public static int inputNumber()
    {
       Scanner scanner = new Scanner(System.in);
       int n;

       System.out.println("Give me a number.");
       n = Integer.parseInt(scanner.nextLine());
   
       return n;
    } // END inputNumber


} // END class calculate
