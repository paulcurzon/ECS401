/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file input.
  It copies a line from one file to another
   
******************************************** */
import java.io.*;

class copyafile
{

    public static void main(String[] params) throws IOException 
    {
        BufferedReader inStream = new BufferedReader(new FileReader("myindata2.txt"));
        PrintWriter outStream = new PrintWriter(new FileWriter("myoutdata2.txt"));
        
        String line = inStream.readLine();
        while(line != null)
        {
            System.out.println(line); //echo to screen too
            outStream.println(line);
            line = inStream.readLine();
        }
        inStream.close();
        outStream.close();
        
        System.exit(0);
    }
} 