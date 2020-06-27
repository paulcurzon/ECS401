/* ***************************************
   AUTHOR: Paul Curzon
	A program that prints a welcome message
	Notice how the program called hellogoodbye is 
	made of 3 methods. One called main
	one called helloMessage
	and one called goodbyeMessage.
   ****************************************/

class hellogoodbye
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
        // THEN print out the message as given by method goodbyeMessage 
		
		helloMessage();
		goodbyeMessage();
		System.exit(0);
		
    } // END main
	
	/* ***************************************
	*	Define a method to print a welcome message
	*/
	
    public static void helloMessage ()
    {
        System.out.println("Hello"); 
        System.out.println("I just woke up"); 
	
	    return;
    } // END helloMessage


	
	/* ***************************************
	*	Define a method to print a goodbye message
	*/
	
    public static void goodbyeMessage ()
    {
        System.out.println("Goodbye"); 
        System.out.println("I'm going back to sleep"); 
	
	    return;
    } // END goodbyeMessage
	
} // END class hellogoodbye
