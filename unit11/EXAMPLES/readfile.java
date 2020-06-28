/* *****************************************
AUTHOR Paul Curzon
Illustrate input when the file size is unknown in advance

Read a file in, displaying it line by line on the screen.

Modify the program so it copies the file input out to a new file
  
******************************************** */
import java.io.*;

class readfile
{

    public static void main(String[] params) throws IOException 
    {
        BufferedReader inStream = new BufferedReader(new FileReader("in.txt"));
 
        String nextword = inStream.readLine();

        // Repeatedly check the current word and write it to the output file if not null
        while (nextword != null)
        {
            System.out.println(nextword);
            nextword = inStream.readLine();
        }

        inStream.close();
        
        System.exit(0);
    }
} 