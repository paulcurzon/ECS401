/* AUTHOR Paul Curzon
   This finds out who people love and tells everyone about it
 */

import java.util.Scanner; // Needed to make Scanner available for input/output

class Unit1Ex2c
{

  public static void main (String[] p)
  {
     lovetriangle();
     System.exit(0);
  } //END main
  
	
	/* ***************************************
	*	Print a message about a love triangle about who the user loves and who loves them
	*/
	  
  public static void lovetriangle ()
  {
    String yourname;
    String youlove;
    String lovesyou;
  
     // get the names of three people in a love triangle and store results in variables
    yourname = askname();
    youlove = askloves();
    lovesyou = asklovesyou();

    System.out.println( yourname + " loves " + youlove + 
                        " but " + lovesyou + " loves " + yourname + "!");
    
    return;
  } // END askquestions

	/* ***************************************
	*	Get the users name
	*/
 public static String askname ()
  {
     String name;
      // create a scanner so we can read the command-line input
     Scanner scanner = new Scanner(System.in);

    //  ask for the person's name
    System.out.println("What's your name?");

    // get their name as a String and store in variable name
    name = scanner.nextLine();
   
    return name;
  } // END askname

	/* ***************************************
	*	Find out who the user likes
	*/
  public static String askloves ()
  {
     String love;
    
     // create a scanner so we can read the command-line input
     Scanner scanner = new Scanner(System.in);

    //  ask a question
    System.out.println("Who do you love?");

    // get their input as a String and store in a different variable theylove
    love = scanner.nextLine();
    
    return love;
  } // END askloves


	/* ***************************************
	*	Find out who loves the user
	*/
  public static String asklovesyou ()
  {
     String secondlove;
    
     // create a scanner so we can read the command-line input
     Scanner scanner = new Scanner(System.in);

    //  ask a question
    System.out.println("Who loves you?");

    // get their input as a String and store in a different variable theylove
    secondlove = scanner.nextLine();
    
    return secondlove;
  } // END asklovesyou


} // END Unit1Ex2c