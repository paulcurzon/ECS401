
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - non-terminating while loops.
 
   Ask the user if they want to go on repeatedly with
   no way of stopping
   
   Knowing about pressing CTR-C to stop a program is kinda important
   
******************************************** */
class while2
{
    public static void main (String[] param)
    {
       int i = 0;  

       while (true)
       {
           i = i + 1;
           System.out.println(i + " ");
       }
       
       // Try editing this print back in by removing the comment symbol
       //  - what happens when you compile now?
       //      System.out.println("I'm gone");
        
    } // END main

} // END class while2

