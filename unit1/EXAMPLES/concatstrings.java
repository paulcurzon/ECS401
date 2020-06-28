/* AUTHOR Paul Curzon
This program demonstrates the use of concatenating strings.
ie sticking them together
*/

import javax.swing.*;

class concatstrings
{
    public static void main (String[] param)
    {		
        buildMessage();
        System.exit(0);
		
    } // END main


	
   /* ***************************************************
      
   */
	
    public static void buildMessage ()
    {
        // first create three variables, one for each piece of the final message
        // and another to hold the final combined message
        String name;
        String fact;
        String fullmessage;
        
        // set the first two variable to particular strings
        name = "Debbie Harry";
        fact = " is still the coolest lead singer ever";
        
        // then combine them using + to stick them end to end
        fullmessage = name + fact;
        
        // print out the final result
        System.out.println(fullmessage);
        //Note giving the variable name here is as though the whole message was typed here
        return;
     } // END buildMessage

} // END class concatstrings
