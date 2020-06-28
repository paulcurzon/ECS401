
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
   Ask the user for a number, and go round a loop that number of times
   proclaiming love.
   
   What happens if you type in 3, 0 , -1 on different runs?
   Try and predict the answer before you run it.
******************************************** */

import java.util.*; // import the util library for I/O

class iloveyou
{
    public static void main (String[] param)
    {
        
        counttheways();
        System.exit(0);
        
    } // END main
   
    /* ***************************************************
       This method asks the user for a number and prints 
       I love you that
       number of times.
    */
    
    public static void counttheways()
    {

       // Declare variables
       //       
       int n = 0;          // will hold number of times to repeat
       
       // Get an an int from the user to loop that many times
       //
       System.out.println("How do I love thee? Let me count the ways: ");
       n = inputInt("Give me a number:");
       
       // Do the repeated printing of I Love You
       //
       for (int i=1; i<=n; i++)
       {
          System.out.println(i+": I love you!");
       }
       
       return;
    } // END counttheways
    
    
    // A method to input ints
  public static int inputInt (String message)
  {
       Scanner scanner = new Scanner(System.in);
       int answer;

       System.out.println(message);
       answer = Integer.parseInt(scanner.nextLine());
   
       return answer;
  } // END inputInt


} // END class iloveyou
