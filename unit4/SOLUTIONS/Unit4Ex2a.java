/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
  Print Usman's three times. 
  
  EDITED forname.java
  DATE 26 JUNE 2020
******************************************** */

class Unit4Ex2a
{
    public static void main (String[] param)
    {
        
        repeatName();
        System.exit(0);
        
    } // END main

    /* ***************************************************
       This method prints Usman's name 3 times on separate lines.
    */
    public static void repeatName()
    {       
       for (int i=1; i<=3; i++)
       {
          System.out.println("Usman");
       }       
    } // END repeatName
    
} // END class Unit4Ex2a