
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - float variables 

   Add the ages of three children (three integers)
   to work out the total age and average age
   Get the ages from the user.
   Work out an accurate average
******************************************** */

import java.util.Scanner; // Needed to make Scanner available

class average3double
{
    public static void main (String[] param)
    {
        add3ages();
        System.exit(0);   
    } // END main
   
    
    /* ***************************************************
       This method adds the ages of three children 
       getting the ages from the user
    */
    
    public static void add3ages()
    {
       Scanner scanner = new Scanner(System.in);
       int age1;  // each will hold the age of a different child
       int age2;       
       int age3;  
       int totalAge; // the answer when the three ages are added      
       double averageAge; //their accurate average as a float
       //  Get the ages of three people
       
       System.out.println("Give me an age");
       age1 = Integer.parseInt(scanner.nextLine());
   
       System.out.println("Give me an age");
       age2 = Integer.parseInt(scanner.nextLine());
 
       System.out.println("Give me an age");
       age3 = Integer.parseInt(scanner.nextLine());
          
       // Now do the calculation of the total age
       //
       totalAge = age1 + age2 + age3;
       averageAge = totalAge / 3.0;

    
       // Finally give the user the answer
       //   
       System.out.println("The total age of the three children is " + totalAge);
       System.out.println("and their average age is " + averageAge);
       System.out.printf("or without excessive accuracy %.2f \n", averageAge);

       return;  
    } // END add3ages
    
} // END class average3double
