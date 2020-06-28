/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - while loops.
 
   Ask the user if they want to go on repeatedly until they don't
   
   What happens if you type something other than y or n? Predict then try.
   
******************************************** */

import java.util.*;

class while1
{
    public static void main (String[] param)
    {
       String ans = "y";  // y means continue, n means stop
                          // initially set to y or would not enter loop
       

       while (ans.equals("y"))
       {
           System.out.println("Dare to Believe");
           ans = input("Shall I go on? (y/n)");
       }

       System.out.println("I'm gone");

       System.exit(0);
        
    } // END main

   // Input strings
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String ans;

       System.out.println(message);
       ans = scanner.nextLine();
   
       return ans;
    } // END input


} // END class while1 

