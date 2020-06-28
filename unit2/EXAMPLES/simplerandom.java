
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 -  random numbers.
 
   Roll a die  and give the score
   
   How do you get different sided dice? 
   Predict then try changing the program and see if you were right.
   
******************************************** */

//import javax.swing.*; // import the swing library for I/O
import java.util.Random;

class simplerandom
{
    public static void main (String[] param)
    {
        int roll;
        
        roll = rollDice();
        System.out.println("You threw " + roll);

        roll = rollDice();
        System.out.println("You threw " + roll);

        System.exit(0);
        
    } // END main

    
    /* ***************************************************
       Roll a six sided die
    */
    
    public static int rollDice()
    {
       final int SIDES = 6;        // Number of sides on the dice
       Random dice = new Random();  // Create a new random number generator (ie die)
       int dicethrow = dice.nextInt( SIDES ) + 1; // Roll the dice
       return dicethrow;

    } // END rollDice
    

} // END class

