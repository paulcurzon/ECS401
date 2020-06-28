/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file input.
 
   Read a single line from the file hello.txt
     
   What happens if you modify it to do readLine twice 
   (both when the file contains only 1 line and when it contains 2 lines)
   
******************************************** */
import java.io.*;

class readhello
{
    public static void main(String[] params) throws IOException 
    {
        // Create a Reader object connected to the file
        BufferedReader inputStream = new BufferedReader(new FileReader("hello.txt"));

        // Read a single line in from the file and print it to the screen
        String s = inputStream.readLine();
        System.out.println(s);

         //close the file
        inputStream.close();
        
        System.exit(0);
    }
} 