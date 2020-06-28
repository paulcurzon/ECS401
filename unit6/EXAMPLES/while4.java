
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - while loops.
 
   Add a series of numbers asking the user 
   using a sentinel value (-1) to determine when to stop.

******************************************** */

import java.util.*; // import the swing library for I/O

class while4
{
  /* ***************************************************
      Get numbers adding them as you go until -1 is typed.
    */
    
    public static void main (String[] param)
    {       
       final int TERMINATE = -1;
       int count = 0;     // counter of how many times loop body executed
       int ans   = 0;     // next number entered
       int sum   = 0;     // total so far

       // We must get teh first number before the 
       ans = inputInt("Enter a number (-1 to terminate)");

       while (ans != TERMINATE)
       {
           // Process the value given so far as known now not to be -1
           //
           sum = sum + ans;
           count = count + 1;  // keep track of how many have entered 
           
           // Having processed the last number, get the next
           //
           ans = inputInt("Enter a number (-1 to terminate)");
       }

       // Now print out the results
       // Notice this program still tries to print out the average even when it involves
       // dividing by zero
       //
       printResult(count, sum);
       
       System.exit(0);
        
    } // END main

  // Print the sum and count result
    public static void printResult(int count, int sum)
    {
       String resulttext; // build up an answer to print  
       
       resulttext =  "That was " + count + " numbers";
       resulttext = resulttext + "\nwith a sum of " + sum;
       resulttext = resulttext + "\nand an average of " + ((double) sum/ (double) count);
       System.out.println(resulttext);                        
    } // END input



  // Input strings
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String ans;

       System.out.println(message);
       ans = scanner.nextLine();
   
       return ans;
    } // END input

  // Input strings
    public static int inputInt(String message)
    {
       return Integer.parseInt(input(message));
    } // END inputInt

  
} // END class while4

