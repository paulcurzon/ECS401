/*
AUTHOR Paul Curzon
DATE 7 SEPT 2018

This is a very simple recursive parser and calculator for a simple language
that allows expressions that add binary digits:

<EXP> = <DIGIT> + <EXP> | <DIGIT>
<DIGIT> = 0 | 1 

It illustrates how recursive methods can naturally map to recursive problems
and the very basics of how parsers/interpreters for a language are written
*/

import java.util.*;

class simplerecursiveparser
{
  public static void main (String[] param)
  {
    String in = input("Please give me an expression");
    int answer = evalEXP(in); 
    
    print("The answer is " + answer);
    
    System.exit(0);
  }
  
  /* Recursively evaluates expressions
  */ 
  public static int evalEXP (String in)
  {
    int result;
    
    // Use the length as a simple way to decide whether its an addition or a digit
    int length = in.length();
    if (length == 1)
        result = evalDIGIT(in);
    else
        result = evalADD(in);

    return result;
  }
  
  /* Recursively evaluates ADD expressions
  */ 
  public static int evalADD(String in)
  {
    int arg1;
    int arg2;
    int result;

   // Split off the first two tokens as they are fixed
    String first = nextToken(in);
    String rest = restTokens(in);
    String second = nextToken(rest);
    String end = restTokens(rest);

    // Follow the structure of the definition DIGIT + EXP
    arg1 = evalDIGIT(first);  		// DIGIT
    checkOPERATOR(second);  		// +
    arg2 = evalEXP(end); 			// EXP
    
    // Having calculated the arguments recursively, we now do the calculation
    result = arg1 + arg2;
      
    return result;
  }

  /* This just checks if the operator is the right symbol so nothing to return
  */
  public static void checkOPERATOR (String in)
  {
     if (! (in.equals("+"))) quit();
  }

  /* A digit is either 0 or 1. Anything else is a mistake.
  */
  public static int evalDIGIT (String in)
  {
    int result = -1;
    
    if (in.equals("0")) result = 0;
    else if (in.equals("1"))  result = 1;
    else quit(); // Something wrong with the input so quit

    return result;
  }
  
  /* Get a String from the keyboard
   */
   public static String input(String message)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println(message);
      return (scanner.nextLine());
   }
 
   /* General print
   */
   public static void print(String message)
   {
      System.out.println(message);
   }
   
   /* FIrst Character of a string as a string
   */
   public static String nextToken(String in)
   {
      return in.substring(0,1);
   }
  
    /* All but first Character of a string as a string
   */
   public static String restTokens(String in)
   {
      return in.substring(1);
   }
  

 // Something wrong with the input
  public static void quit ()
  {
        print("What you typed isn't an expression in this language");
        System.exit(0);
   }

}