
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
   Ask the user for a number, and go round a loop that number of times
   
   What happens if you type in 3, 0 , -1 on different runs?
   Try and predict the answer before you run it.
******************************************** */

import javax.swing.*; // import the swing library for I/O

class for0
{
    public static void main (String[] param)
    {
        
        fortest();
        System.exit(0);
        
    } // END main

    
    /* ***************************************************
       This method asks the user for a number and pops up an ok box, that number of times.
    */
    
    public static void fortest()
    {

       // Declare variables
       //
       
       String textinput;  // whatever the person types as text
       int n = 0;          // an integer version of textinput
       
       // Get an an int from the user to loop that many times
       // convert (known as parsing) it into a number version
       //

       textinput = JOptionPane.showInputDialog("Enter a number and I will get you saying ok that many times ");
       n = Integer.parseInt(textinput);

       for (int i=1; i<=n; i++)
       {
          JOptionPane.showMessageDialog(null, i);
       }

       JOptionPane.showMessageDialog(null, "I am out of the loop now - are you ok");
       

    } // END fortest
    

} // END class for0