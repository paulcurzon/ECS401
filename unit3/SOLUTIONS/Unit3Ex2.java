
/* *****************************************
AUTHOR Paul Curzon

Unit3 Exercise 2
Answer the question "How many beans make five?".
 

******************************************** */

import java.util.Scanner;

class Unit3Ex2
{
    public static void main (String[] param)
    {
        String answer = inputString("How many beans make five?");
        
        if (answer.equals("5"))
        {
            print("Correct!");
        }
        else
        {
            print("Wrong!");
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

       print(message);
       answer = scanner.nextLine();
   
       return answer;
    } // END inputString

/* *********************************
    Print a message to the screen
*/ 
    public static void
     print(String message)
    {
       System.out.println(message);
       return;
    } // END print

    
} // END class Unit3Ex2
