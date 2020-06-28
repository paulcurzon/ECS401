/* AUTHOR Paul Curzon
This program demonstrates the use of a different command
for printing messages to the screen using pop up boxes.

It uses a library of code called the swing library, that provides 
commands like showMessageDialog. This is a rather complicated method 
someone else wrote for you - the beauty is, you do not need to know
how a method works to use it.
*/

import javax.swing.*; // import the swing library for I/O

class hellobox
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
        
        boxHelloMessage();
        
        System.exit(0);
    } // END main
	
	
	/* ***************************************************
	   Our method boxHelloMessage prints a welcome message in a pop-up box
	*/
	
    public static void boxHelloMessage ()
    {
 
        JOptionPane.showMessageDialog(null, "Hello World!");
        
        return;
		
    } // END boxHelloMessage
	
	
	
}	// END class hellobox

