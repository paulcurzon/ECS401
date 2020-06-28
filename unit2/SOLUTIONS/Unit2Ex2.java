
/* *****************************************
AUTHOR Paul Curzon

Read a temperature in degrees fahrenheit and print out the
corresponding temperature in degrees celcius.
 

******************************************** */

import java.util.Scanner;

class Unit2Ex2
{
    public static void main (String[] param)
    {
        fahrenheitToCelcius();
        System.exit(0);   
    } // END main
   
    
    /* ***************************************************
       This method gets a fahrenheit temperature from the user and prints it in celcius
    */
    
    public static void fahrenheitToCelcius()
    {
       Scanner scanner = new Scanner(System.in);
       
       int celcius; 
       int fahrenheit;       

       //  Get the ages of three people
       
       System.out.println("I convert temperatures from degrees fahrenheit to degrees celcius .");
       System.out.println("Please give me the temperature in degrees fahrenheit (a whole number).");
       fahrenheit = Integer.parseInt(scanner.nextLine());
  
       // Now do the calculation of the total age
       //
       celcius = ((fahrenheit - 32) * 5) / 9;
    
       // Finally give the user the answer
       //   
       System.out.println("The temperature " + fahrenheit + " degrees fahrenheit is " + 
                           celcius + " degrees celcius (rounded down to nearest whole number)");
       return;  
    } // END celciusToFahrenheit
    
} // END class Unit2Ex2
