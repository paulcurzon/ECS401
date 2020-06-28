// AUTHOR Paul Curzon
// A program that keeps track of pay

import java.util.*;

class weeklypay
{
  public static void main (String[] args)
  {
    int total = 0;
    String messagetoprint = "";
    
    for (int i = 1; i <= 4; i++)
    {
      int pay = inputInt("How much did you earn this week?");
           
      total = total + pay;
      messagetoprint = messagetoprint + 
                       "Week " + i + ": " + pay + " euro.\n";
    }
    
    messagetoprint = messagetoprint + "Total this month: " + total;
    print(messagetoprint);
    System.exit(0);
   }
 
  // A method to input integers
  public static int inputInt(String message)
  {
     return Integer.parseInt(input(message));
  }

  // A method to input strings
  public static String input(String message)
  {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
  } // END input

  // A method to print messages
  public static void print(String message)
  {
     System.out.println(message);
     return;
  }
}