/* *****************************************
AUTHOR Paul Curzon

  A program to demonstrate if statements on a string value 
  
  Print an insulting message or not
  
  Try changing the assignment of ans to something else to see the
difference.  Notice that you do not use == to compare strings, but
rather use the more cumbersome equals. Using == for strings is a
common mistake so watch out for it...
   
******************************************** */

import java.util.Scanner;

class insultornot
{
    public static void main (String[] param)
    { 
        insultme();
        System.exit(0);
        
    } // END main

/* *********************************
    A method that asks to insult you 
*/
    public static void insultme()
    {

       String ans; 
       ans = inputString("Can I insult you, please?");
       
       if (ans.equals("yes"))
       {
           printInsultingMessage();
       }
       else
       { 
           printNiceMessage();
       }

       System.out.println("Bye!");
       return;

    } // END insultme
 
 
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
    

/* *********************************
    Print an insulting message 
*/
    public static void printInsultingMessage()
    {
       System.out.println("You smell!"); 
       System.out.println("I mean it!");
 
       return;

    } // END printInsultingMessage

/* *********************************
    Print a nicemessage 
*/
    public static void printNiceMessage()
    {
       System.out.println("You smell of roses!");
       System.out.println("Wow!!");
 
       return;

    } // END printNiceMessage
    
} // END class insultornot
