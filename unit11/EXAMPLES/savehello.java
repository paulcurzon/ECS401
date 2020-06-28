
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file output.
 
   Store "Hello World" into a file called "hello.txt"
   
   Adapt it so it prints Hello <your name> into a file called myname.txt
   
******************************************** */

import java.io.*;

class savehello
{
    public static void main(String[] params) throws IOException 
    {
        //first create a stream object so you can access the file
        PrintWriter outputStream = new PrintWriter(new FileWriter("hello.txt"));

        // then use that stream as the place to print to
        outputStream.println("Hello World");

        // tidy up by closing the file
        outputStream.close();
        
        System.exit(0);
    }
} 