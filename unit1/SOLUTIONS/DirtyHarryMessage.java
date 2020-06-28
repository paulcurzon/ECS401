/* AUTHOR Paul Curzon
Prints a Clint Eastwood welcome. "Go ahead Punk Make my day!"
UNIT 1 Exercise 1b
This is a better program than the simple answer - it has been more fully tidied up
to make it easier to read and understand with better comments and better names of 
things throughout.

This is adapted from the hellovariable1 program.

- Changed the string value stored in Variable myWelcome
- Changed that variable in all three places it occurs to harryWelcome
  (the declaration, the initialisation and its use in the print statement)
- Changed the name of the method - both in the definition and where it is called.
- Comments throughout have been updated for the new program.

*/

import javax.swing.*;

class DirtyHarryMessage
{
    public static void main (String[] param)
    {		
        harryMessage();
        System.exit(0);
		
    } // END main
	
    /* ***************************************************
       Prints a Dirty Harry Welcome Message
       Stores the string to print in a variable, then accesses the variable
    */
	
    public static void harryMessage ()
    {
        String harryWelcome;
        
        harryWelcome = "Go ahead Punk. Make my day!";
        System.out.println(harryWelcome);
		return;
    } // END harryMessage
	
} // END class DirtyHarryMessage
