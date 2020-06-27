/* *****************************************
AUTHOR Paul Curzon

  A chatbot program to demonstrate use of records and arrays
  
  Start a conversation about the paralympics
   
******************************************** */

import java.util.Scanner;
import java.lang.*;

class paralympics2
{

// Ask a question about the paralympics and try and say something relevant to the answer.
    public static void main (String[] param)
    { 
    
       String [] targetwords = {"wheelchair", "cycling"};
       String [] responses = {"I love wheelchair racing myself.\nI'm sad David Weir has retired.\nDoes Alex Zanardi inspire you?",
                              "I thought Kadeena Cox was amazing, winning in two sports. Who most inspired you?"};
       
       
       String ans = inputString("Which paralympic sports do you like?");
       
       // Scan through the targetwords to see if a hit and if so respond 
       // If not keep looking for a match
       for(int i = 0; i<targetwords.length; i++)
       {
           if (ans.contains(targetwords[i]))
           {
              System.out.println(responses[i]);
           }
       }
       
       System.out.println("I'm lost for words. Got to go!");
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
/* **********************************/ 
 