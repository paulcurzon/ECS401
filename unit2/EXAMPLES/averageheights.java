
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - double (floating point_)variables 

   Add the heights of three children (three decimal numbers in metres)
   to work out the total height and average height
   Get the heights from the user.
   Work out an accurate average and one to cm accuracy
******************************************** */

import java.util.Scanner; // Needed to make Scanner available

class averageheights
{
    public static void main (String[] param)
    {
        averageOfHeights();
        System.exit(0);   
    } // END main
   
    
    /* ***************************************************
       This method averages the heights of three children 
       getting the heights from the user
    */
    
    public static void averageOfHeights()
    {
       Scanner scanner = new Scanner(System.in);
       double height1;  // each will hold the height of a different child
       double height2;       
       double height3;  
       double totalHeight; // the answer when the three heights are added      
       double averageHeight; //their accurate average as a double
       
       //  Get the heights of three people
       
       System.out.println("Give me a height (in m)");
       height1 = Double.parseDouble(scanner.nextLine());
   
       System.out.println("Give me a height (in m)");
       height2 = Double.parseDouble(scanner.nextLine());
 
       System.out.println("Give me a height (in m)");
       height3 = Double.parseDouble(scanner.nextLine());
          
       // Now do the calculation of the total and average height
       //
       totalHeight = height1 + height2 + height3;
       averageHeight = totalHeight / 3.0;

    
       // Finally give the user the answer
       //   
       System.out.println("The total height of the three children is " + totalHeight);
       System.out.println("and their average height is " + averageHeight);
       System.out.printf("or without excessive accuracy (ie to cm accuracy) %.2f \n", averageHeight);

       return;  
    } // END averageOfHeights
    
} // END class averageheights
