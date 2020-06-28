/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
  Print my name three times. 
******************************************** */

class forname
{
    public static void main (String[] param)
    {
        repeatName();
        System.exit(0);
        
    } // END main

    /* ***************************************************
       This method prints my name 3 times on separate lines.
    */
    public static void repeatName()
    {       
       for (int i=1; i<=3; i++)
       {
          System.out.println("Paul");
       }       
    } // END repeatName

} // END class forname