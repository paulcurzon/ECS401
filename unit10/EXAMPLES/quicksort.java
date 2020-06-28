/*
A version of quicksort with tracing included so you can see what happens
*/
class quicksort 
{

    static String printarray (int[] array) 
    {
       String txt = "";
       for (int i=0; i < array.length-1; i++) 
       {
         txt = txt+array[i]+" ";
	   }
	   if (array.length > 0) txt = txt+array[array.length - 1];

	   return txt;
    }

    static void report (String txt) 
    {
       System.out.println(txt);
    }


    // quicksort: algorithm based no Gosling's variant from nist
    static void quicksort (int[] array, int from, int upto) 
    {
        // print details of call
        report("calling qs ("+printarray(array)+", "+from+", "+upto+")");

        if (from < upto)
        {


          // make the pivot value middle of array
          int pivot = array[(from+upto)/2];

          // set up two pointers into the array
          int lower = from, upper = upto;
        
          while (lower <= upper) 
          {
            // first move lower up over small elements
	 	    while ((array[lower] < pivot) && (lower < upto)) { lower++; }
	 	  
            // otherwise move upper down over large elements
		    while ((array[upper] > pivot) && (upper > from)) { upper--; }
		
            // if pointers haven't crossed
            if (lower <= upper) 
            {
		      int tmp = array[upper];
		      array[upper] = array[lower];
		      array[lower] = tmp;
		      lower++;
		      upper--;
		    }
	      }

          report("doing qs(..,., "+from+", "+upto+") with current "+printarray(array));

	     if (from < upper) quicksort(array,from,upper);
	     if (lower < upto) quicksort(array,lower,upto);

	    }
	    report("leaving qs (..., "+from+", "+upto+") with result "+printarray(array));

     }

    public static void main (String param[]) 
    {

      int array[] = {10,7,8,6,1,4,3,2,5,9};

      report(printarray(array));

	  quicksort(array,0,9);

	  report("Result is: "+printarray(array));

    }
}
