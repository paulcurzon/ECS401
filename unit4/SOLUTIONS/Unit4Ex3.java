
/* *****************************************
AUTHOR Paul Curzon

Unit4 Exercise 3
  Add console print lines (System.out.println) to the for1.java program 
  (which prints a given number of stars)to
  print the values of the variable i inside the loop to trace its execution -
  so you can see what happens to the variables in the loop each time as it executes.
  
 EDITED: for1.java
 DATE: 27/6/20
******************************************** */

import java.util.*; // import the swing library for I/O

class Unit4Ex3
{
    public static void main (String[] param)
    {
        
        fortest();
        System.exit(0);
        
    } // END main
    
    /* ***************************************************
       This method asks the user for a number and prints that
       number of *s.
       
       It includes code to print the loop count to help debug
    */
    
    public static void fortest()
    {

       // Declare variables
       //
       int n = 0;          // whatever the person types as an int
       String  resulttext ="";  // build a string to print the result as in one go at end
       
       // Get an an int from the user to loop that many times
       // convert (known as parsing) it into a number version
       //

       n = inputInt("Enter a number and I will print that many *s: ");
       
       resulttext = buildStars(n);

       System.out.println(resulttext);
       
       return;
    } // END fortest
    

   // Create a string of the given number of stars   
    public static String buildStars(int howmany)
    {
    
       String  stars ="";
       for (int i=1; i<=howmany; i++)
       {
           stars = stars + "*";
           System.out.println(i);   // ADDED a line to print I 
       }
       
       return stars;
    } // END buildStars


   
    // A method to input ints
  public static int inputInt (String message)
  {
       Scanner scanner = new Scanner(System.in);
       int answer;

       System.out.println(message);
       answer = Integer.parseInt(scanner.nextLine());
   
       return answer;
  } // END inputInt



} // END class  Unit4Ex3