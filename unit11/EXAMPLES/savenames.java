/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file output.
   It is intended to be used with the program readnames which gets 3 names from a file
 
  Store three names to the file mydata.txt, one per line

   Adapt it so it asks the user for the name of the file using keyboard input first
   
   Adapt it to store 5 names in to the file
   
******************************************** */
import java.io.*;

class savenames
{

    public static void main(String[] params) throws IOException 
    {
        PrintWriter outputStream = new PrintWriter(new FileWriter("mydata.txt"));

        // Create an array with some sample names to store
        String [] names = {"Paul", "Jo", "Mo"};
            
        // Store the names from the array in the file, one name per line    
        for (int i = 0; i < names.length; i++)
        {
                outputStream.println(names[i]);
        }
        
        outputStream.close();
        
        System.exit(0);
    }
} 