/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
  Print Usman's a fixed number of times. Include Start and End message.
  Ask the user first for the number of times to repeat.
  
  Store number of times repeated in a variable 
  
  EDITED forname.java
  DATE 26 JUNE 2020
******************************************** */
import java.util.*; // import the util library for I/O

class Unit4Ex2e
{
    public static void main (String[] param)
    {
        
        repeatName();
        System.exit(0);
        
    } // END main

    /* ***************************************************
       This method prints Usman's name some times on separate lines.
       It gets the number of times from the user.
    */
    public static void repeatName()
    {       
       int nrepeated = inputInt("Enter a number and I will repeat your name that many times");
 
       System.out.println("Starting List");
       
       for (int i=1; i <= nrepeated; i++)
       {
          System.out.println("Usman");
       } 
             
       System.out.println("Ending List");
    } // END repeatName


    // A method to input ints
    public static int inputInt (String message)
    {
       Scanner scanner = new Scanner(System.in);
       int answer;

       System.out.println(message);
       answer = Integer.parseInt(scanner.nextLine());
   
       return answer;
    } // END inputInt

    
} // END class Unit4Ex2e