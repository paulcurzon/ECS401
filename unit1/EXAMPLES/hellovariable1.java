/* AUTHOR Paul Curzon
This program demonstrates the use of variables for storing pieces
of information that are then used in a later command.

*/

import javax.swing.*;

class hellovariable1
{
    public static void main (String[] param)
    {		
        storeHelloMessage();
        System.exit(0);
		
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
    /* ***************************************************
       This demonstrates creating a variable (a storage space) that can hold  data (a string orsequences of characters)
       that is then used later. The variable used here is called myWelcomeMessage. The
       assignment operator = stores the message in the variable. We then get the information (value)
       out again by giving the variable name where otherwise we could have just given the value.
    */
	
    public static void storeHelloMessage ()
    {
        String myWelcome;
        
        myWelcome = "Hi, there. This is Eddie your shipboard computer speaking";
        System.out.println(myWelcome);
		                 //Note giving the variable name here is as though the whole message was typed here
		return;
    } // END storeHelloMessage
	
} // END class hellovariable1
