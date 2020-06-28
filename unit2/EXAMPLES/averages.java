
/* *****************************************
AUTHOR Paul Curzon
This program 
 - demonstrates the diference between integer and double operations
 
   Average two input numbers
******************************************** */

import java.util.Scanner; // Needed to make Scanner available

class averages
{
    public static void main (String[] param)
    {
        averageNumbers();
        System.exit(0);   
    } // END main
   
    
    /* ***************************************************
       Averages 2 numbers input from the keyboard
    */
  
    public static void averageNumbers()
    {
       String str1;   String str2;
       int number1;   int number2;
       double average; //their  average
       
       str1 = inputNumberString();
       number1 = Integer.parseInt(str1);          
       str2 = inputNumberString();
       number2 = Integer.parseInt(str2);       
          
       // Now do the calculation of the average as an int
       average = (double) ((number1 + number2) / 2);
       System.out.println("The average is " + average);

       // Now do the calculation of the average as a double
       average = (number1 + number2) / 2.0;
       System.out.println("The average is " + average);
    
       return;  
    } // END averageNumbers

   
    /* ***************************************************
       Ask for a number and return the string typed
    */
        
    public static String inputNumberString()
    {
       String numberstring;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Give me a number");
       numberstring = scanner.nextLine();
 
       return numberstring;  
    } // END inputNumberString


    
} // END class averages
