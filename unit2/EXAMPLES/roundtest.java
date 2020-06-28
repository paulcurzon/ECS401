	
/* ***************************************
   AUTHOR: Paul Curzon
	A program that tests various ways of rounding/truncating a decimal number.
	Modify it to experiment and make sure you know what each approach does...
	What would be the result of multiplying by 100, truncating and then dividing by 100, 
	for example?
	
	An improvement might be to let the user input the original number to test
   ****************************************/

class roundtest
{
    public static void main (String[] param)
    {
        double d = 5.99999; // Set a value to test
        
        System.out.println("d itself is " + d);
        
        double dround = Math.round (d); 
        System.out.println("d rounded using Math.round is " + dround); 

        double dfloor = Math.floor (d); 
        System.out.println("d floored using Math.floor is " + dfloor); 
       
        int dcasttoint = (int) (d); 
        System.out.println("d cast to an int is " + dcasttoint); 
        
        double d2 = d*10;
        double d3 = (int) (d2);
        double d4 = d3/10;
        System.out.println("d multiplied by 10 truncated then divided by 10 is " + d4);

      
        double d5 = d*10;
        double d6 = Math.round (d5);
        double d7 = d6/10;
        System.out.println("d multiplied by 10 rounded then divided by 10 is " + d7);


		System.exit(0);
		
    } // END main

} // END class roundtest