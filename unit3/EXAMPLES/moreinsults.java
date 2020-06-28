// AUTHOR Paul Curzon
// A program that insults if asked but then apologises
// This shows the difference between if staircases and 
// if statements in sequence
// It also shows the use of boolean variables

import java.util.Scanner;

class moreinsults
{
  public static void main (String[] args)
  {
      boolean insult; //keep track of whether I insulted
      String answer = input("Can I insult you (a) a lot, (b) a little or (c) not at all?");
      
      if ((answer.equals("a")) || (answer.equals("A")))
      {
         print("You smell of poo!");
         insult = true;
      }
      else if ((answer.equals("b")) || (answer.equals("B")))
      {
         print("You smell!");
         insult = true;
      }
      else
      {
         print("You smell of roses!");
         insult = false;
      }

     // Now apologise if needed
      if (insult)
      {
         print("Sorry, that was rude!");
      }
      
      System.exit(0);
  }

  // A method to input strings
  public static String input (String message)
  {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
  }

  // A method to print messages
  public static void print (String message)
  {
     System.out.println(message);
     return;
  }

}