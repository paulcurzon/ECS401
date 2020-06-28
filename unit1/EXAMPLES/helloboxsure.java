/* AUTHOR Paul Curzon
This program demonstrates the use of a different command
for printing messages to the screen using pop up boxes.

It uses a library of code called the swing library, that provides 
commands like showMessageDialog. This is a rather complicated method 
someone else wrote for you - the beauty is, you do not need to know
how a method works to use it.

This program demonstrates splitting the program in to multiple methods
*/

import javax.swing.*; // import the swing library for I/O

class helloboxsure
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
        boxHelloMessage();
        confirm();
        
        System.exit(0);
    } // END main


   /* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
	
    /* ***************************************************
       Our method boxHelloMessage prints a welcome message in a pop-up box
    */
	
    public static void boxHelloMessage ()
    {
 
        JOptionPane.showMessageDialog(null, "The World says Hello - Is that OK?");
        return;
		
    } // END boxHelloMessage
	
	
    /* ***************************************************
       Our method confirm prints a welcome message in a pop-up box
    */
	
    public static void confirm ()
    {
 
        JOptionPane.showMessageDialog(null, "Are you sure it's OK?");
        JOptionPane.showMessageDialog(null, "Do you really mean that?");
        JOptionPane.showMessageDialog(null, "Well if you are absolutely sure - but don't blame me");
        return;
		
    } // END confirm
	
	
} 	// END class hellobox
