	
/* ***************************************
   AUTHOR: Paul Curzon
	A program that tests what happens when you divide integers and try
	to get a double answer in different ways. This shows how casting to the right
	type at the right time matters (and that Java does hidden cast operations rather than
	the more helpful raising an error and requiring the programmer to be clear about what they want)
	
	An improvement might be to let the user input the original number to test
   ****************************************/

class casttest
{
    public static void main (String[] param)
    {
        int myInt = 8; // Set a value to test
        
		System.out.println("myInt itself is " + myInt);
        
        int myIntDividedBy3 = myInt/3; // Set a value to test
		System.out.println("myInt divided by 3 is " + myIntDividedBy3);

        // This does integer division then converts the result to a double.
        double myIntDividedBy3asDouble = myInt/3; 
		System.out.println("myInt divided by 3 then stored as a double is " + myIntDividedBy3asDouble);

        // This does integer division then converts the result to a double explicitly.
        // This is actually what the above does automatically adding the cast operation
        double myIntDividedBy3CastasDouble = (double) (myInt/3); 
		System.out.println("myInt divided by 3 then cast explicitly to a double and stored " + myIntDividedBy3CastasDouble);


        // Now convert to a double first so we then do floating point division
        double myIntCastDividedBy3asDouble = ((double) myInt)/3.0; 
		System.out.println("myInt cast to a double divided by 3.0 then stored as a double is " + myIntCastDividedBy3asDouble);
        // Notice the answer is not exactly accurate - and this can lead to calculation bugs.


		System.exit(0);
		
    } // END main

} // END class casttest