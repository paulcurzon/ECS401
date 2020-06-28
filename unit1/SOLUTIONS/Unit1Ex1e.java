/* AUTHOR Paul Curzon
This program prints text for an address label

It is modified from concatstrings.java
CHANGES
- Change class name
- Changed method name to be more informative
- Used informative variable names
*/

import javax.swing.*;

class Unit1Ex1e
{
    public static void main (String[] param)
    {		
        addressLabel();
        System.exit(0);
		
    } // END main
	
   /* ***************************************************
   
   */
	
    public static void addressLabel ()
    {
        // first create variables, one for each piece of the final message
        // and anothers to hold the final combined message
        String name;
        String address;
        String postcode;
        String fulladdress;
        
        // set the name and address in the separate variables
        // \n adds in line breaks
        name = "Paul Curzon\n";
        address = " 54 Programming Towers\n Shell Street, Java Land\n";
        postcode = "E1 4NS";
        
        //Create the full address
        fulladdress = name + address + postcode;
        
        // print out thefull address
        JOptionPane.showMessageDialog(null, fulladdress);

     } // END addressLabel

} // END class Unit1Ex1e