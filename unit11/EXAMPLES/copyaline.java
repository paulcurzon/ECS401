/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - simple file input.
  It copies a line from one file to another
   
******************************************** */
import java.io.*;

class copyaline
{

    public static void main(String[] params) throws IOException 
    {
        BufferedReader inStream = new BufferedReader(new FileReader("myindata.txt"));
        PrintWriter outStream = new PrintWriter(new FileWriter("myoutdata.txt"));
        
        String line = inStream.readLine();
        System.out.println(line); //echo to screen too
        outStream.println(line);

        inStream.close();
        outStream.close();
        
        System.exit(0);
    }
} 