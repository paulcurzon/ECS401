/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - while loops
 - random numbers.
 
   Try and guess what coin will be tossed repeatedly.
******************************************** */

import java.util.*;
import java.util.Random;

class while5
{
    public static void main (String[] param)
    {
        String ans = "y";
        Random coin = new Random();
        
        while (ans.equals("y"))
        {
            int toss = tosscoin(coin);
            String guess = input("Guess - will it be Heads or tails? (h/t)");

            if (guess.equals("h") & toss==1)
	              System.out.println("You're right! It was heads.");
            else if (guess.equals("t") & toss==0)
	              System.out.println("You're right! It was tails.");
            else if (guess.equals("t") & toss==1)
	              System.out.println("Sorry! It was heads.");
            else if (guess.equals("h") & toss==0)
	              System.out.println("Sorry! It was tails.");
            else 
	              System.out.println("Sorry, didn't understand your guess. Please put h or t next time.");

	        ans = input("Another Guess? (y/n)");
        }
        System.exit(0);
        
    } // END main

   // Toss a Coin - to give 0 or 1
    public static int tosscoin(Random cointotoss)
    {
       int tossedcoin = cointotoss.nextInt(2);
       return tossedcoin;
    }

   // Input strings
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String ans;

       System.out.println(message);
       ans = scanner.nextLine();
   
       return ans;
    } // END input


} // END class while5

