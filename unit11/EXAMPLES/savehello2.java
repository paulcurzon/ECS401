
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file output.
 
   Store "Hello World" into a file called "file.txt"
   The file name is stored in a variable showing it can be manipulated like any string
   
   Adapt it to print 2 lines to the file
   
******************************************** */

import java.io.*;

class savehello2
{
    public static void main(String[] params) throws IOException 
    {
        String filename = "file";
        PrintWriter outputStream = new PrintWriter(new FileWriter(filename + ".txt"));

        outputStream.println("Hello World");
        outputStream.close();
        System.exit(0);
    }
} 