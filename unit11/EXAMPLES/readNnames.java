/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file input.
   It is intended to be used with the program saveNnames which puts  names in a file
   It demonstrates the idea of a simple file format
   This program assumes the first line of the file holds a number 
   giving the total number of names in the file
 
   It reads that number in
   Then Reads in that many names from subsequent lines using a loop and print them out
   all from the file mydata2.txt 
   
   Adapt it to read in names and ages of people 
   (make sure there are a mixture of names and ages in the file first!)
   
******************************************** */
import java.io.*;

class readNnames
{

    public static void main(String[] params) throws IOException 
    {
        BufferedReader inStream = new BufferedReader(new FileReader("mydata2.txt"));

        // Read in first file entry as an integer - the number of names stored       
        int NumberofNames = Integer.parseInt(inStream.readLine());
        System.out.println(NumberofNames);
        
        // Create an array big enough
        String [] names = new String[NumberofNames];

        // Now read in the names
        for (int i = 0; i < names.length; i++)
        {
            names[i] = inStream.readLine();
            System.out.println(names[i]);
        }
        
        inStream.close();
        
        System.exit(0);
    }
} 