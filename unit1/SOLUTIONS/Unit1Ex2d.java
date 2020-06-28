/* AUTHOR Paul Curzon
   Prints a message about your country and favourite city
 */

import java.util.Scanner; // Needed to make Scanner available for input/output

class Unit1Ex2d
{

  public static void main (String[] p)
  {
     nicestcity();
     System.exit(0);
  } //END main
  

	/* ***************************************
	*	Ask where the person was born
	*/
 public static String askforcountry ()
  {
     String yourcountry;

     Scanner scanner = new Scanner(System.in);

    System.out.println("What country were you born in?");
    yourcountry = scanner.nextLine();
   
    return yourcountry;
  } // END askforcountry


	/* ***************************************
	*	Ask for their favourite city in their country of birth
	*/
  public static String askforcity ()
  {
     String yourcity;

     Scanner scanner = new Scanner(System.in);

    System.out.println("What is your favourite city in that country?");
    yourcity = scanner.nextLine();
    
    return yourcity;
  } // END askforcity
	
	/* ***************************************
	*	Find out then print a message about their city and country
	*/
	  
  public static void nicestcity ()
  {
    String country;
    String city;
  
     // get the names of three people in a love triangle and store results in variables
    country = askforcountry();
    city = askforcity();

    System.out.println( city + " is the nicest city in " + country);
    
    return;
  } // END nicestcity


} // END Unit1Ex2d