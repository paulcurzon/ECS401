
  /* **********************************************
     A calculator that parses simple arithmetic expressions
     The language's grammar is
	SIMPLE = 	NUMBER |
              	-SIMPLE |
				(EXP) 
	
	MULT = 	SIMPLE |
			SIMPLE*MULT |
			SIMPLE/MULT 

	EXP = 	MULT |
			MULT+EXP |
			MULT-EXP 
			
	NUMBER = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

     */

import java.util.*;

class parsingcalculator
{
  public static void main (String[] param)
  {
    CharacterStream in = inputCharStream("Please input the calculation");
    int answer = evalEXP(in); 
    
    System.out.println("The answer is " + answer);
    
    System.exit(0);
  }

  /* **********************************************
 	EXP = 	MULT |
			MULT+EXP |
			MULT-EXP 
   */
  
  public static int evalEXP (CharacterStream in)
  {

    int result = evalMULT(in);
    char next = peekAtNextChar(in);
    
    if (next == '+')
    {
       int rest;
       
       readPastNextChar(in);
       rest = evalEXP(in);
       result = result + rest;
    }
    else if (next == '-')
    {
       int rest;
       
       readPastNextChar(in);
       rest = evalEXP(in);
       result = result - rest;
    }
    
    return result;
  }


  /* **********************************************
 	MULT = 	SIMPLE |
			SIMPLE*MULT |
			SIMPLE/MULT 
     */

  public static int evalMULT (CharacterStream in) 
  {
    int result = evalSIMPLE(in);
    char next = peekAtNextChar(in);
    
    if (next == '*')
    {
       int rest;
       
       readPastNextChar(in);
       rest = evalMULT(in);
       result = result * rest;
    }
    else if (next == '/')
    {
       int rest;
       
       readPastNextChar(in);
       rest = evalMULT(in);
       result = result / rest;
    }

    return result;
  }

  /* **********************************************
	SIMPLE = 	NUMBER |
              	-SIMPLE |
				(EXP) 
     */

  public static int evalSIMPLE (CharacterStream in)
  {
    int result;
    char next = peekAtNextChar(in);
    
    if (next == '(')   // (EXP)
    {
       char last;
       
       readPastNextChar(in);
       result = evalEXP(in);
       last = nextChar(in);
       if (last != ')') quit();

    }
    else if (next == '-') // -SIMPLE
    {
       readPastNextChar(in);
       result = -1 * evalSIMPLE(in);
    }
    else               //  NUMBER
    {
      result = evalNUMBER(in);
    }  

    return result;
  } 

  public static int evalNUMBER (CharacterStream in)
  {
    int result = -1;
    char next = nextChar(in);
    
     
    if (next == '0') result = 0;
    else if (next == '1') result = 1;
    else if (next == '2') result = 2;
    else if (next == '3') result = 3;
    else if (next == '4') result = 4;
    else if (next == '5') result = 5;
    else if (next == '6') result = 6;
    else if (next == '7') result = 7;
    else if (next == '8') result = 8;
    else if (next == '9') result = 9;
    else quit(); // Something wrong with the input so quit

    return result;
  }

 // Something wrong with the input
  public static void quit ()
  {
        System.out.println("What you typed isn't an expression");
        System.exit(0);
   }

/* ************************************************** */
/* *******     ADT FOR Character Stream     ********* */
/* ************************************************** */


/* Have a look at the next character, but don't move on from it.
   Leave it at the front of the stream
*/
  public static char peekAtNextChar (CharacterStream in)
  {
     char ch;
     String s = in.text;
     
     if (in.position >= s.length()) // Dont read off end of string
         ch = 'x'; // return a dummy answer
     else 
         ch = s.charAt(in.position);
          
     return ch;
  }

/* Get a character from the front of the stream and move 
   the front of the stream on
*/
  public static char nextChar (CharacterStream in)
  {
     char ch = peekAtNextChar(in);
     
     readPastNextChar(in);
     
     return ch;
  }

/* Move the front of the stream on
*/
  public static void readPastNextChar (CharacterStream in)
  {
      in.position = in.position + 1;
  }


/* Input a new piece of text and create a stream from it
   with front of stream set to the first (0th) character.
   Print the message prior to doing the input
*/
  public static CharacterStream inputCharStream (String message)
  {
     CharacterStream in = new CharacterStream();
     Scanner scanner = new Scanner(System.in);
     
     System.out.println(message);
     in.text = scanner.nextLine();
     in.position = 0;
     
     return in;
  }

}


/* ******************
Bind the string text to parse into a record / abstract data type with the position 
pointing to the next character in the string to process.

By using an abstract data type we could easily switch to getting the input eg from a file instead.
*/
class CharacterStream
{
  String text;
  int position;
}