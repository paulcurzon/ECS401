
/* *****************************************
AUTHOR Paul Curzon

   A program to demonstrate if on a character value Asks the user for
   a yes or no answer then indicates what they pressed. 
   
    What happens if you type in a word rather than a letter when asked? 
   
******************************************** */

import java.util.Scanner; // import the swing library for I/O

class if_char
{
    public static void main (String[] param)
    {
        
        yesNo();
        System.exit(0);
        
    } // END main


    /* ***************************************************
       Show how a chain of tests on characters can be done
    */
    
    public static void yesNo()
    {

       // Declare variables
       //
        String reply;    // which branch to take from user
        char ans;        // char version of it 
       
       // Ask for a response then take the first letter of it as a character to test
       // using the method charAt preceded by the name of the string
        reply = inputString("Enter Y/N: ");
        ans = reply.charAt(0);
       
        if (ans == 'y')
        {
           System.out.println("yes");        
        }
        else if (ans == 'Y')
        {
            System.out.println("YES");
        }   
        else if (ans=='n')
        {
            System.out.println("no");
        }   
        else if (ans=='N')
        {
            System.out.println("NO");
        }   
        else
        {
            System.out.println("What?!?!");
        }   
        
        System.out.println("Thanks for your answer");
        
        return;             
    } // END yesNo
    
    
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


} // END class if_char
    
