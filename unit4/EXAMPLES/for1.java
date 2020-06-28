
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
   Ask the user for a number, and go round a loop that number of times
   
   What happens if you type in 3, 0 , -1 on different runs?
   Try and predict the answer before you run it.
******************************************** */

import java.util.*; // import the util library for I/O

class for1
{
    public static void main (String[] param)
    {
        
        fortest();
        System.exit(0);
        
    } // END main
    
    /* ***************************************************
       This method asks the user for a number and prints that
       number of *s.
    */
    
    public static void fortest()
    {

       // Declare variables
       //
       int n = 0;          // whatever the person types as an int
       String  resulttext ="";  // build a string to print the result as in one go at end
       
       // Get an an int from the user to loop that many times
       // convert (known as parsing) it into a number version
       //

       n = inputInt("Enter a number and I will print that many *s: ");
       
       resulttext = buildStars(n);

       System.out.println(resulttext);
       
       return;
    } // END fortest
    

   // Create a string of the given number of stars   
    public static String buildStars(int howmany)
    {
    
       String  stars ="";
       for (int i=1; i<=howmany; i++)
       {
           stars = stars + "*";
       }
       
       return stars;
    } // END buildStars


   
    // A method to input ints
  public static int inputInt (String message)
  {
       Scanner scanner = new Scanner(System.in);
       int answer;

       System.out.println(message);
       answer = Integer.parseInt(scanner.nextLine());
   
       return answer;
  } // END inputInt



} // END class for1