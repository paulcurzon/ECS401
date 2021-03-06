import java.util.Scanner; // Needed to make Scanner available

/* AUTHOR Paul Curzon
  This shows how methods can return results by rewriting an earlier program 
  in a better way.
   
   This finds out who people love and tells everyone about it
 */
class keyboardinputwithmethods
{

  public static void main (String[] p)
  {
     askquestions();
     System.exit(0);
  } //END main
  
	
	/* ***************************************
	*	Print a message about who the user loves
	*/
	  
  public static void askquestions ()
  {
    String yourname;
    String youlove;
  
     // get the names using the methods created and store results in variables
    yourname = askname();
    youlove = askloves();

    System.out.println("Oooh! Everyone listen! " + yourname + " loves " + youlove);
    
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

} // END keyboardinputmethods