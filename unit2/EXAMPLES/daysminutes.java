/* *****************************************
AUTHOR Paul Curzon

Converts a length of time given
in days to a length of time in minutes. 
For example 1 day would be
converted to 1440 minutes (as 1x60x24=1440).
******************************************** */

import java.util.Scanner; // Needed to make Scanner available

class daysminutes
{
    public static void main (String[] param)
    {
		convertDaysToMinutes();
		System.exit(0);	
    } // END main
	
	/* ***************************************************
	   Get a number of days from the user and print
	   the corresponding number of minutes.
	*/
	
    public static void convertDaysToMinutes()
    {
       // Declare variables
	   //
       int days;     // a length of time in days
       int minutes;  // the same length of time in minutes
	   
	   // constant multipliers for hours in a day and minutes in an hour
	   final int HOURS_IN_DAY = 24;
       final int MINS_IN_HOUR = 60;
	  	   
 	   String answertext;  // construct the text to give the answer back 
	   
	   // Get a number of days from the user 
	   //
       days = inputTimeInterval();

       // Now do the calculation
	   // multiply minutes in an hour by hours in a day
	   //
       minutes = days *  MINS_IN_HOUR * HOURS_IN_DAY;
	   
	   answertext = days + " days is "+ minutes + " minutes"; 

	   // Finally give the user the answer
	   //   
	   System.out.println(answertext);  
	   
	   return;
    } // END convertDaysToMinutes

   
    /* ***************************************************
       This method gets a time interval in days from the user and returns it
    */
    public static int inputTimeInterval()
    {
       Scanner scanner = new Scanner(System.in);
       int t;

       System.out.println("What is the time interval in days?");
       t = Integer.parseInt(scanner.nextLine());
   
       return t;
    } // END inputTimeInterval
	

} // END class daysminutes
