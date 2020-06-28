
/* *****************************************
AUTHOR Paul Curzon

   A program to demonstrate if on a character value Asks the user for
   a yes or no answer then indicates what they pressed. 
   
    This shows how you can have other commands - here assignments inside an if
    You can even have a sequence of commands.
   
******************************************** */

import java.util.Scanner; // import the swing library for I/O

class if_char2
{
    public static void main (String[] param)
    {
        
        yesNo2();
        System.exit(0);
        
    } // END main


    /* ***************************************************
       Show how a chain of tests on characters can be done
    */
    
    public static void yesNo2()
    {

       // Declare variables
       //
        String reply;    // which branch to take from user
        char ans;        // char version of it 
        String finalresponse;   // Build string printed to the user.
       
       // Ask for a response then take the first letter of it as a character to test
       // using the method charAt preceded by the name of the string
        reply = inputString("Enter Y/N: ");
        ans = reply.charAt(0);
       
        if (ans == 'y')
        {
           finalresponse = "yes";        
        }
        else if (ans == 'Y')
        {
           finalresponse = "YES";
        }   
        else if (ans=='n')
        {
           finalresponse = "no";
        }   
        else if (ans=='N')
        {
           finalresponse = "NO";
        }   
        else
        {
           finalresponse = "What?!?!";
        }   
        
        finalresponse = "You said: " + finalresponse + ". Thanks for your answer";
        System.out.println(finalresponse);
        return;
    } // END yesNo2
    

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


} // END class if_char2
    
