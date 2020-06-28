	
/* ***************************************
   AUTHOR: Paul Curzon
	A program that prints a welcome message
	Notice how the program called hello is 
	made of 2 methods. One called main
	and one called helloMessage.
   ****************************************/

class hello
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
		
		helloMessage();
		System.exit(0);
		
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
	/* ***************************************
	*
	*	Define a method to print a welcome message
	*/
	
    public static void helloMessage ()
    {
 
        System.out.println("Hello World"); 
	
	    return;
    } // END helloMessage
	
} // END class hello
