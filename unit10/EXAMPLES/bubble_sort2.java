//Bubble sort program
// This version includes a trace statement so you can see the pattern of the sorting
//It prints the result at the end of each pass.
class bubble_sort2 
{

    static void sort (int[] array)
    {
        boolean sorted=false;

        while (!sorted)
        {
	       // array potentially sorted 
            sorted = true;
            
	       //traverse array switching ill-ordered pairs
	       for (int i=0; i < array.length-1; i++)
	       {
                if (array[i] > array [i+1])
                {
		          // swap them
		          int tmp = array[i+1];
		          array[i+1] = array[i];
		          array[i] = tmp;
		          // array wasn't sorted
		          sorted = false;
		          
                  // write array so can see whats happening
                  write_array(array);

		         }
	       }
	    }
    }
	
	    
    static void write_array(int[] array)
    {
	    for (int i=0; i < array.length; i++)
	    {
	             System.out.print(array[i]+" ");
	    }
	    System.out.println();
    }



	
    public static void main (String param[])  {
 
        int size=5;

        // declare array and initialise with random elements
        int array[] = {5,4,3,2,1};
        
        // print it out
        for (int i=0; i<size; i++)
        {
           System.out.print(array[i]+" ");
        }
        System.out.println();
         
        sort(array);        

        // print it out again

        for (int i=0; i<size; i++)
        {
           System.out.print(array[i]+" ");
        }
        System.out.println();


    }
}
