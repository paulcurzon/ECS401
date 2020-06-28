
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
   Ask the user for a number, and print a table of factorials up to that point

******************************************** */

import java.util.*; // import the util library for I/O

class exp_fact
{
    public static void main (String[] param)
    {
        
        expfacttable();
        System.exit(0);
        
    } // END main

    /* ***************************************************
       This method asks the user for a number and prints the
       factorial and exponential functions up to that number in a table
    */
    
    public static void expfacttable()
    {      
       // What size table?
       int length = inputInt("Enter a number and I will print factorials and exponentials to that number: ");
       
       //Create the header rows of the table
       //
       String  hdr = createHeader();  // build a string to print the result as in one go at end

       // Build the body rows of the table of a given length
       //
       String bdy = createTable(length);
       
       // Print the table
       //  
       System.out.print(hdr + bdy);
       
       return;
    } // END expfacttable
    
    
       // Create a header for the table 
       // This is where all the work is done!  
       // Build the  table a row at a time each time round the loop
       //
    public static String createTable(int lnth)
    {
       String table = "";
       int fact = 1;
       int exp = 1;
       
       for (int i=1; i<=lnth; i++)
       {
           fact = i*fact;
           exp = 2*exp;
           table = table + i+"\t\t "+exp+"\t\t "+fact+ "\n";
       }

       return table;
    } // END createTable


       // Create a header for the table   
    public static String createHeader()
    {
       String  header ="";
       header = header + "No\t\t Exp\t\t Fact\n";
       header = header + "=====================================\n";

       return header;
    } // END createHeader


    // A method to input ints
  public static int inputInt (String message)
  {
       Scanner scanner = new Scanner(System.in);
       int answer;

       System.out.println(message);
       answer = Integer.parseInt(scanner.nextLine());
   
       return answer;
  } // END inputInt


} // END class exp_fact
