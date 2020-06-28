/* *****************************************
AUTHOR Paul Curzon
This program demonstrates the use of a way for the 
person using your program to give the program some information
using pop-up boxes.

It also uses the swing library for the command showInputDialog. 
******************************************** */

import javax.swing.*; // import the swing library for I/O

class inputbox
{
    public static void main (String[] param)
    {
       // We want to print out the message defined in method helloMessage
       askForFact();
       System.exit(0);
       
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
    /* ***************************************************
      Our method askForFact asks the user for a fact,
      then stores it in the variable called userfact.
      it is then printed back as part of a message.
    */
	
    public static void askForFact()
    {

       String userfact = JOptionPane.showInputDialog("Go on tell me something you believe!");
       
       JOptionPane.showMessageDialog(null, "So... you think..." + userfact + " do you");
       return;

    } // END askForFact


} // END class inputbox
