
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - integer variables
 - doing calculations.
 
   Ask the user for a number, and perform a simple calculation on it:
   square it and divide by 3. Finally print out the result
******************************************** */

import java.util.Scanner; // Needed to make Scanner available

class yearborn
{
    final static int CURRENTYEAR = 2016; // The year the calculation is based on
                                     // will need to change this each year.
                                    // This is available everywhere
                                    // ONLY do this for final variables that are unchanging

    public static void main (String[] param)
    {       
        born();
        System.exit(0);   
    } // END main
    
    /* ***************************************************
       This method asks the user their age and works out their
       year of both. It only works if current year is correct
       or the person gives their age in that year.
    */
    public static void born()
    {
       // Declare variables
       //   
       int age;          // an integer version of textinput
       int year;        // the calculated year of birth
       String answertext;  // construct the text to give the answer back 
       
       // Get an age (a string) from the user then
       // convert (known as parsing) it into a number version
       //
       age = inputAge();

       // Now do the calculation
       //
       year = CURRENTYEAR - age; 
       answertext = "You must have been born in " +
                     year + " or " + (year - 1); 

       // Finally give the user the answer
       //   
       System.out.println(answertext);
       
       return;
    } // END born
 
     
    /* ***************************************************
       This method gets a single integer age from the user 
       in a given year and returns it
    */
    public static int inputAge()
    {

       Scanner scanner = new Scanner(System.in);
       int age;

       System.out.println("Tell me your age in " +  CURRENTYEAR);
       age = Integer.parseInt(scanner.nextLine());
   
       return age;
    } // END inputAge
   

} // END class yearborn
