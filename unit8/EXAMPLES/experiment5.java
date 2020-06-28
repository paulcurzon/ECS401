/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - strings and assignments / equality

 Equality of strings is surprising. The same strings can be different!
******************************************** */
import java.util.*;

class experiment5
{
    public static void main (String param[])
    {
         String string1 = "aaa";
         String string2 = "aaa";

	     System.out.println("string1 = \"" + string1 + "\"");
	     System.out.println("string2 = \"" + string2 + "\"");

	     System.out.println("string1 == string2: " + (string1 == string2));
	     System.out.println("Oh dear, didn't expect that! They are the same references!");
	     System.out.println("They are not behaving exactly like arrays");
	     System.out.println("Some optimisation is going on in the compiler!");

         String string3 = input("Enter string3 (type in aaa): ");

	     System.out.println("string1 = \"" + string1 + "\"");
	     System.out.println("string3 = \"" + string3 + "\"");
	     System.out.println("string1 == string3: " + (string1 == string3));
	     System.out.println("As we expect they are different references - a new string has been created this time");
	     System.out.println("and just in case you think they really are different");
	     System.out.println("lets check with .equals");
	     System.out.println("string1.equals(string3): " + string1.equals(string3));
	     System.out.println("string3.equals(string1): " + string3.equals(string1));
    }
    
     
/* *********************************
    Ask for a string with given message
    Return the string typed in by the user
*/ 
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
    } // END inputString

}

