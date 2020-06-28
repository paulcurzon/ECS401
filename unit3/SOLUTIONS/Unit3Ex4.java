
/* *****************************************
AUTHOR Paul Curzon

Unit3 Exercise 4
A program that asks the user to input three integers and then prints out the larger of the
two.

Note this is getting overly complicated. When we get to arrays we will see a better way.
 

******************************************** */

import java.util.Scanner;

class Unit3Ex4
{
    public static void main (String[] param)
    {
        int num1 = inputInt("Please give me the first integer");
        int num2 = inputInt("Please give me the second integer");
        int num3 = inputInt("Please give me the third integer");
        
        if ((num1 > num2) & (num1 > num3))
        {
            print("The first integer (" + num1 + ") was the larger");
        }
        else if ((num2 > num1) & (num2 > num3))
        {
             print("The second integer (" + num2 + ") was the larger");
        }
        else if ((num3 > num1) & (num3 > num2))
        {
             print("The second integer (" + num3 + ") was the larger");
        }
       else 
        {
             print("None is larger than both the others.");
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
    Ask for an integer with given message
    Return the int typed in by the user
    Will crash if they do not type an integer
*/ 
    public static int inputInt(String message)
    {
       String answer;
       int numericAnswer;
       
       answer = inputString(message);
       numericAnswer = Integer.parseInt(answer);
   
       return numericAnswer;
    } // END inputInt



/* *********************************
    Print a message to the screen
*/ 
    public static void
     print(String message)
    {
       System.out.println(message);
       return;
    } // END print

    
} // END class Unit3Ex4
