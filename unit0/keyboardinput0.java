import java.util.Scanner; // Needed to make Scanner available

/* 
  @author	Paul Curzon
  @date 	30 June 2020
  @version 	1

  This shows keyboard input from the terminal window
   First create a scanner linked to the keyboard (System.in)
   Think of it as a pipe sucking characters typed into the program
   Then ask a question storing the answer in a variable
   (a kind of storage box)
   to use in the later message.
   
   This finds out a person's name and echos it back twice.
 */
class keyboardinput0
{

  public static void main (String[] p)
  {
     askquestion();
     
     System.exit(0);

  } //END main
  
  
  public static void askquestion ()
  {
     String name;
    
     // create a scanner so we can read the command-line input
     Scanner scanner = new Scanner(System.in);

    //  ask for the person's name
    System.out.println("What's your name?");

    // get their name as a String and store in variable called name
    name = scanner.nextLine();

    System.out.println("So your name is " + name);
    System.out.println("Hello " + name);
    
    return;
  } // END askquestion

} // END keyboardinput0