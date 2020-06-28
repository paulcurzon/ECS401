
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - while loops implementing counter controlled loops
 - tracing loops
 
    
   Add numbers up to a given number typed.
   Really to demonstrate the trace statements added to debug it
   Now it works they can be commented out.
   
******************************************** */

import java.util.*;

class tracing1
{
    public static void main (String[] param)
    {
        int num, sum=0;
        int i = 1;
        
        System.out.println("Pt A: sum=" + sum  + "  i=" + i);

        num = inputInt("Enter a number: ");

        System.out.println("Pt B: num=" + num + "  sum=" + sum + "  i=" + i);


        while(i<= num)
        {
	        System.out.println("Pt C: num="+num+"  i="+i+"  sum=" + sum + "  i=" + i);
	        sum = sum + i;
	        System.out.println("Pt D: num="+num+"  i="+i+"  sum=" + sum + "  i=" + i);
	    
	        i = i + 1;
	    }

	    System.out.println("Pt E: num=" + num + "  sum=" + sum + "  i=" + i);

        System.out.println("The sum of the numbers from 1 to " + num + " is " + sum);
    }
    
    
  // Input strings
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String ans;

       System.out.println(message);
       ans = scanner.nextLine();
   
       return ans;
    } // END input

  // Input Integer
    public static int inputInt(String message)
    {
       return Integer.parseInt(input(message));
    } // END inputInt

}

