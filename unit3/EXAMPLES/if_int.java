
/* *****************************************
AUTHOR Paul Curzon

A program to demonstrate if  on an integer value
   Try typing in numbers other than 1 or 2
   and change the literal 1 in the test to other things
   to see what happens
******************************************** */

import java.util.Scanner; // import the swing library for I/O

class if_int
{
    public static void main (String[] param)
    {
        
        chooseDirection();
        System.exit(0);
        
    } // END main


    /* ***************************************************
       Show how the first branch of an if is executed if an equality test is true
    */
    
    public static void chooseDirection()
    {

       // Declare variables
       //
        int branch;        // int version of it
       
        branch = inputInt("Do you want to take the first branch (type 1) or the second (type 2)");
       
        if (branch == 1)
        {
           System.out.println("The first branch was executed and the second ignored");        // Executed if the test is true
        }
        else
        {
            System.out.println("The second branch was executed and the first ignored");       // Executed if the test is false
        }   
        
        System.out.println("After the IF statement we continue on our way");   
        
        return;              
       
    } // END chooseDirection

 // A method to input ints
  public static int inputInt (String message)
  {
       Scanner scanner = new Scanner(System.in);
       int answer;

       System.out.println(message);
       answer = Integer.parseInt(scanner.nextLine());
   
       return answer;
  } // END inputInt
    

} // END class if_int
