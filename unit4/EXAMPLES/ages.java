/* *****************************************
AUTHOR Paul Curzon

  A program to print the averages of a series of 
  pairs of ages.
  
  Illustrates how methods can return values.
   
******************************************** */

import java.util.*;

class ages
{
    public static void main (String[] param)
    { 
        averageAges();
        System.exit(0);
        
    } // END main


/* *********************************
    Ask for 10 pairs of ages for a husband and wife printing their average 
*/
    public static void averageAges()
    {
       String resulttext = "";
       
       for (int i=1; i<=10; i++)
       {
          int averageAge;

          System.out.println("I need you to give me a pair of ages for a couple");
          averageAge = calculateAverage();
          resulttext = resulttext + "Couple " + i + ": " + averageAge + "\n";
        }

        System.out.println("Here are the average ages of the couples");
        System.out.println(resulttext);
        return;
    } // END averageAges


/* *********************************
    A method that asks for ages of a wife and husband and returns their average 
*/
    public static int calculateAverage()
    {
       int husband;
       int wife;
       int average;

       husband = inputInt("Give me the husband's age");
       wife = inputInt("Give me the wife's age");
 
       average = average2(husband, wife);

       return average;
    } // END calculateAverage
    

/* *********************************
    Calculate the average of two given numbers 
*/
    public static int average2(int v1, int v2)
    {
       int average;

       average = (v1 + v2) / 2;

       return average;
    } // END average2

    
    // A method to input ints
  public static int inputInt (String message)
  {
       Scanner scanner = new Scanner(System.in);
       int answer;

       System.out.println(message);
       answer = Integer.parseInt(scanner.nextLine());
   
       return answer;
  } // END inputInt



    
} // END class ages
