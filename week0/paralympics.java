/* *****************************************
AUTHOR Paul Curzon

  A program to demonstrate ways to spot substrings in a string 
  using the method contains
  
  Start a conversation about the paralympics
   
******************************************** */

import java.util.Scanner;
import java.lang.*;

class paralympics
{

// Ask a question about the paralympics and try and say something relevant to the answer.
    public static void main (String[] param)
    { 
       String ans = inputString("Which paralympic sports do you like?");
       
       if (ans.contains("wheelchair"))
       {
           System.out.println("I love wheelchair racing myself.");
           System.out.println("I'm sad David Weir has retired.");
           System.out.println("Does Alex Zanardi inspire you?");
       }
       else if (ans.contains("cycling"))
       { 
           System.out.println("I thought Kadeena Cox was amazing, winning in two sports. Who most inspired you?");
       }
       else
       { 
           System.out.println("I didn't see much of that.");
       }

       System.exit(0);
        
    } // END main


 
/* *********************************
    Ask for a string with given message
    Return the string typed in by the user
*/ 
    public static String inputString(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
    } // END inputString

    
} // END class paralympics
