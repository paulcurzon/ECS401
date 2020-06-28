
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - while loops.
 
   Ask the user if they want to go on repeatedly until they don't.
   Count how many times you've asked, to illustrate how
   an explicit counter can be used with a while loop.
   
   What happens if you type something other than y or n? Predict then try.
   
******************************************** */

import java.util.*;

class while3
{
    public static void main (String[] param)
    {
       String ans = "y";  // y means continue, n means stop
                          // initially set to y or would not enter loop
       int count = 0;     // counter of how many times loop bady executed


       while (ans.equals("y"))
       {
           System.out.println("Dare to Believe");

           ans = input("Shall I go on? (y/n)");
           count = count + 1;
       }

       System.out.println("That was " + count + " times");
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


} // END class while3

