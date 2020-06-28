
/* *****************************************
AUTHOR Paul Curzon

Read a temperature in degrees celcius and print out the
corresponding temperature in degrees fahrenheit.
 

******************************************** */

import java.util.Scanner;

class Unit2Ex3
{
    public static void main (String[] param)
    {
        celciusToFahrenheit();
        System.exit(0);   
    } // END main
   
    
    /* ***************************************************
       This method gets a celcius temperature from the user and prints it in fahrenheit
    */
    
    public static void celciusToFahrenheit()
    {
       Scanner scanner = new Scanner(System.in);
       
       int celcius; 
       int fahrenheit;       

       //  Get the ages of three people
       
       System.out.println("I convert temperatures from degrees celcius to degrees fahrenheit.");
       System.out.println("Please give me the temperature in degrees celcius (a whole number).");
       celcius = Integer.parseInt(scanner.nextLine());
  
       // Now do the calculation of the total age
       //
       fahrenheit = ((celcius * 9) / 5) + 32;
    
       // Finally give the user the answer
       //   
       System.out.println("The temperature " + celcius + " degrees celcius is " + 
                           fahrenheit + " degrees fahrenheit (rounded down to nearest whole number)");
       return;  
    } // END celciusToFahrenheit
    
} // END class Unit2Ex3
