/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
  Print Usman's 6 times. Include Start and End message. 
  
  EDITED forname.java
  DATE 26 JUNE 2020
******************************************** */

class Unit4Ex2c
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
       System.out.println("Starting List");
       
       for (int i=1; i<=6; i++)
       {
          System.out.println("Usman");
       } 
             
       System.out.println("Ending List");
    } // END repeatName
    
} // END class Unit4Ex2c