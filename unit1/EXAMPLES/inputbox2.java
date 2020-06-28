/* *****************************************
AUTHOR Paul Curzon
This program demonstrates the use of a way for the 
person using your program to give the program some information.
It uses pop up boxes.

This shows how to get several pieces of information using pop-up boxes, 
storing them in variables


It also uses the swing library for the command showInputDialog. 
******************************************** */

import javax.swing.*; // import the swing library for I/O

class inputbox2
{
    public static void main (String[] param)
    {
       // We want to print out the message defined in method helloMessage
       askForFacts();
       System.exit(0);

    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
	
    /* ***************************************************
       Our method askForFact asks the user for a their name
       and nickname, then stores them in their own variables
       called name and nickname...
       they are then printed back as part of a message.
     */
	
    public static void askForFacts()
    {

       String name = JOptionPane.showInputDialog("Tell me your name");
       String nickname = JOptionPane.showInputDialog("Tell me your  nickname");
       
       JOptionPane.showMessageDialog(null, "Hello..." + name + " also known as " + nickname);
       
       return;

    } // END askForFacts

} // END class inputbox2
