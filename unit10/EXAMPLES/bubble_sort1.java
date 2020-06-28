//Bubble sort program

class bubble_sort1  
{

    static void sort (int[] array)
    {
        boolean sorted=false;

        while (!sorted)
        {
	       // array potentially sorted 
            sorted = true;
            
	       //traverse array to end switching ill-ordered pairs
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
		         }
	       }
	    }
    }
	
    public static void main (String param[])
    {
        int size=5;

        // declare array and initialise with random elements
        int array[] = {5,3,4,1,2};
        
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
