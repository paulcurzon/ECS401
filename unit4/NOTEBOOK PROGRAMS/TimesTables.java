/* *****************************************
@author Paul Curzon
@version 1
@date 28 July 2020

    A program to illustrate if statements inside loops.

    Print a given times table in a 10 x 10 format
******************************************** */
import java.util.Scanner; // Needed to make Scanner available

class TimesTables
{
    public static void main(String[] p)
    {

        nTimesTable ();
        
        System.exit(0);
    }

    // Print the three times table in a 10 x 10 square format
    //
    public static void nTimesTable ()
    {
        final int TABLE_SIZE = 100;
        int timestable = inputInt("Which times table should I print");
    
        for (int i=1; i<=TABLE_SIZE; i++)
        {
            if (isEndOfRow(i) & isInTimesTable(i, timestable)) 
            {
                System.out.println(i);
            }
            else if (isEndOfRow(i))
            {
                System.out.println(".");
            }
            else if (isInTimesTable(i, timestable))
            {
                System.out.print(i + "\t");
            }
            else 
            {
                System.out.print(".\t");
            }
        }
    }


    // Check if first argument divides by the second
    //
    public static boolean dividesByN(int i, int n)
    {
        boolean result = (i % n == 0);
    
        return result;
    }


    // Is it time to go on to a new line (ie every 10th number)
    //
    public static boolean isEndOfRow(int i)
    {
        return dividesByN(i,10);
    }

    // Is the first argument in the times table of the second
    //
    public static boolean isInTimesTable(int i, int n)
    {
        return dividesByN(i,n);
    }
    
    
    
    // Input a String
    //
    public static String inputString (String message)
    {
       String answer;
       Scanner scanner = new Scanner(System.in);

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
    }
   
    // input an integer
    //    
    public static int inputInt (String message)
    {
       String answer = inputString(message);
   
       return Integer.parseInt(answer);
    }
}