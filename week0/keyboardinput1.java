import java.util.Scanner; // Needed to make Scanner available

/* AUTHOR Paul Curzon

  This shows keyboard input from the terminal window
   First create a scanner linked to the keyboard (System.in)
   Then ask two questions storing the answer in different variables
   to use in the later message.
   
   This finds out who people love and tells everyone about it
 */
class keyboardinput1
{

  public static void main (String[] p)
  {
     askquestions();
     System.exit(0);

  } //END main
  
  
  public static void askquestions ()
  {
     String name;
     String theylove;
    
     // create a scanner so we can read the command-line input
     Scanner scanner = new Scanner(System.in);

    //  ask for the person's name
    System.out.println("What's your name?");

    // get their name as a String and store in variable name
    name = scanner.nextLine();

    //  ask a question
    System.out.println("Who do you love?");

    // get their input as a String and store in a different variable theylove
    theylove = scanner.nextLine();

    System.out.println("Oooh! Everyone listen! " + name + " loves " + theylove);
    
    return;
  } // END askquestions

} // END keyboardinput1