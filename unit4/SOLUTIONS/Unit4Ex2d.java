/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
  Print Usman's 6 times. Include Start and End message.
  Store number of times repeated in a variable 
  
  EDITED forname.java
  DATE 26 JUNE 2020
******************************************** */

class Unit4Ex2d
{
    public static void main (String[] param)
    {
        
        repeatName();
        System.exit(0);
        
    } // END main

    /* ***************************************************
       This method prints Usman's name 6 times on separate lines.
    */
    public static void repeatName()
    {       
       int nrepeated = 6;
 
       System.out.println("Starting List");
       
       for (int i=1; i <= nrepeated; i++)
       {
          System.out.println("Usman");
       } 
             
       System.out.println("Ending List");
    } // END repeatName

    
} // END class Unit4Ex2d