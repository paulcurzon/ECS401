/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - arrays and assignments

 Equality of arrays using ==  checks equality of references
 not equality of the contents of the arrays.
******************************************** */

class experiment4
{

    public static void main (String param[]) 
    {
        int lgth = 4;
        
        // create and fill the array a

        int a[] = new int[lgth];
        
	    for (int i=0; i<lgth; i++) 
	    {
	      a[i] = i;
	    }
	
	    System.out.println("a: " + arrayToString(a));

        // create and fill the array b so is exactly the same

        int b[] = new int[lgth];
        for (int i=0; i<lgth; i++)
        {
           b[i] = i;
        }
	    System.out.println("b: " + arrayToString(b));

        System.out.println("Is a==b?  " + (a==b));


        System.out.println("Now do b=a; then check if they are still ==");
        
        b=a;

        System.out.println("Is a==b?  " + (a==b));

	    
	    System.out.println("a: " + arrayToString(a));
	    System.out.println("b: " + arrayToString(b));
    }
    
    /* Create a string for printing that shows the contents of an array
    */    
    public static String arrayToString (int[] array) 
    {
	  int length = array.length;
	  String array_string = "";
	  for (int i=0; i<length-1; i++)
	  {
	    array_string = array_string + array[i] + " ";
	  }
	  array_string = array_string + array[length-1];
	  return array_string;
    }

}
