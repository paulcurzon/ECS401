/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - arrays and assignments

 DOing an assignment 
 a = b;
 just copies references
 - it makes them point to the same place.
******************************************** */

class experiment1
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

        // create and fill the array b

        int b[] = new int[lgth-2];
        for (int i=0; i<lgth-2; i++)
        {
           b[i] = 10+i;
        }
	    System.out.println("b: " + arrayToString(b));

        // create and fill the array c

        int c[] = new int[lgth];
        for (int i=0; i<lgth; i++)
        {
          c[i]=20+i;
        }
	    System.out.println("c: " + arrayToString(c));


        System.out.println("Now do b=a; then print the results on the three arrays");
        
        b=a;
	    
	    System.out.println("a: " + arrayToString(a));
	    System.out.println("b: " + arrayToString(b));
	    System.out.println("c: " + arrayToString(c));

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
