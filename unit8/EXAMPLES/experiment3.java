/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - arrays and assignments

 Assigning to an individual element of an array changes the actual value in that element
 so anything pointing to it will see the change
******************************************** */

class experiment3
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

        System.out.println("Now do b=a; then print the results on the  arrays");
        
        b=a;
	    
	    System.out.println("a: " + arrayToString(a));
	    System.out.println("b: " + arrayToString(b));


	    System.out.println("Change a: a[0]=20;");

	    a[0]=20;

	    System.out.println("a: " + arrayToString(a));
	    System.out.println("b: " + arrayToString(b));

	    System.out.println("Change b: b[1]=30;");

	    b[1]=30;

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
