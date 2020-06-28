/* Define a character stream and use it in a simple demo.
   Program from booklet on character streams
*/

import java.util.*;

class characterstreamdemo
{

  // A simple use of a character stream printing out all the as in it
  //Just for demonstration purposes
  public static void main (String[] param)
  {
    CharacterStream in = inputCharStream("Give me some characters");
    while (! isEmptyCharStream(in))
    {
        if (peekAtNextChar (in) == 'a')
        {
           System.out.println(nextChar (in));
        }
        else
        {
           readPastNextChar(in);
        }
    }
    
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
  
/* Return true if all the characters in the stream are used up
*/
  
  public static boolean isEmptyCharStream (CharacterStream in)
  {
     String s = in.text;  
     if (in.position >= s.length())
         return true;
     else 
         return false; 
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