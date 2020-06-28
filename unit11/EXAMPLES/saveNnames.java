/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file output.
   It is intended to be used with the program readNnames which puts  names in a file
   It demonstrates the idea of a simple file format
   This program creates a file with first line of the file holding
    a number giving the total number of names that will be put in the file
 
    It then puts that many names into the subsequent lines of the file (mydata2.txt)   
   Adapt it to save names and ages of people stored in 2 different arrays.
   (make sure there are a mixture of names and ages in the file first!)
   
******************************************** */
import java.io.*;

class saveNnames
{

    public static void main(String[] params) throws IOException 
    {
        PrintWriter outputStream = new PrintWriter(new FileWriter("mydata2.txt"));

        int NumberofNames = 3;
        outputStream.println(NumberofNames);
        
        String [] names = {"Paul", "Jo", "Mo"};
            
        for (int i = 0; i < names.length; i++)
        {
                outputStream.println(names[i]);
        }
        
        outputStream.close();
        
        System.exit(0);
    }
} 