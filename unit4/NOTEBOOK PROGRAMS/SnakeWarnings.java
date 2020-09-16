/* *****************************************
@author Paul Curzon
@version 1
@date 28 July 2020

    A program to illustrate if statements inside loops.

    Print warnings about snakes and whether venomous, harmless, constrictors or unknown.
******************************************** */
import java.util.Scanner; // Needed to make Scanner available

class SnakeWarnings
{
    public static void main(String[] p)
    {

        snakeWarnings ();
        
        System.exit(0);
    }

    // Print warnings about snakes - harmless? Crush you? Venomous? or unknown?
    //
    public static void snakeWarnings ()
    {    
        for(int i = 1; i<=4; i++)
        {
            String snake = inputString("Name a snake and I will tell you if it is venomous");
            
            if (snake.equals("Python") | snake.equals("Anaconda") )
            {
                System.out.println("The " + snake + " is NOT venomous. However, it can crush you to death.");
            }
            else if (snake.equals("Cobra"))
            {
                System.out.println("The " + snake + " IS venomous.");
            }
            else if (snake.equals("Grass Snake"))
            {
                System.out.println("The " + snake + " is harmless.");
            }
            else
            {
                System.out.println("I have not heard of the " + snake + " so assume it is dangerous.");
            }
        }
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
}