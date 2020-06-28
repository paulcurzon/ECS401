/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file input.
   It is intended to be used with the program savenames which puts 3 names in a file
 
   Read in three names from the file mydata.txt using a loop and print them out

   Adapt it so it asks the user for the name of the file using keyboard input first
   
   Adapt it to read in 5 names (make sure there are 5 names in the file first!)
   
******************************************** */
import java.io.*;

class readnames
{

    public static void main(String[] params) throws IOException 
    {
        BufferedReader inStream = new BufferedReader(new FileReader("mydata.txt"));

        String [] names = new String[3];
            
        System.out.println("The names in the file mydata.txt are:");
        
        for (int i = 0; i < names.length; i++)
        {
            names[i] = inStream.readLine();
            System.out.println(names[i]);
        }
        
        inStream.close();
        
        System.exit(0);
    }
} 