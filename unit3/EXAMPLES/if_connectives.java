
/* *****************************************
AUTHOR Paul Curzon

  A program to demonstrate logical connectives used to check more complex conditions. 
  
  Notice && is used when ALL conditions must hold for that branch to be taken
         || is used when ANY of the conditions holding is enough for it to be taken
         
  Try running the program over and over answering with different alternatives
  Make sure you understand what it is doing.   
******************************************** */

import java.util.Scanner; // import the swing library for I/O

class if_connectives
{
    public static void main (String[] param)
    {
        
        yesNoOR();
        yesNoAND();

        System.exit(0);
        
    } // END main


   /* ***************************************************
     Show how you use || (AND) to check lots of alternatives with same response or action needed
   */

    public static void yesNoOR()
    {

        // Get a string to do a test on
        //
        String ans = inputString("First answer: Yes or No?");            // create a string to do a test on
        
        if (ans.equals("yes") || ans.equals("YES") || ans.equals("Yes") || ans.equals("y") || ans.equals("Y"))
        {
           System.out.println("You chose YES in some way");        
        }   
        else if (ans.equals("no") || ans.equals("NO") || ans.equals("No") || ans.equals("n") || ans.equals("N"))
        {
           System.out.println("You chose NO in some way");        
        }   
        else
        {
          System.out.println("What?!?!");
        }   
        
        return;
       
    } // END yesNoOR
    
 
 
 
   /* ***************************************************
     Show how you use && (AND) to check lots of alternatives with same response or action needed
   */

    public static void yesNoAND()
    {

        // Get two strings to do a test on using AND
        //
        String ans1 = inputString("Now answer then confirm your answer: Yes or No?"); 
        String ans2 = inputString("Are you sure (Yes or No)?"); 
        
        if (ans1.equals("Yes") && ans2.equals("Yes") ) // Both Yes
        {
           System.out.println("You chose YES and were sure");        
        }   
        else if (ans1.equals("No") && ans2.equals("Yes")) // No then Yes
        {
           System.out.println("You chose NO and were sure");        
        }
        else if (ans1.equals("No") && ans2.equals("No")) // Both No
        {
           System.out.println("You chose No but aren't sure");        
        } 
        else if (ans1.equals("Yes") && ans2.equals("No")) // Yes then No
        {
           System.out.println("You chose Yes but aren't sure");        
        }     
        else
        {
          System.out.println("What?!?!");
        }   
        
        return;
       
    } // END yesNoOR
    

     
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
    

} // END class if_String
