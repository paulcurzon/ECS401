/* *****************************************AUTHOR Paul CurzonThis program demonstrates  - procedure call.  Prints P 8 P in big letters. This shows how where the same thing is done over and over a method can be created to allow that to be done without having to write the code over and over.  It shows how information can be passed to procures as arguments that can then be used within a method.  Note that each method the variable declared as an argument could be called anything!  Each method does its own well defined job.   Try editing the main method to print P8P using differnt small letters or adding new letters.******************************************** */class printP8Pagain{    public static void main (String[] param)    {                printBigP("P");        printBlankLine();        printBig8("7");        printBlankLine();        printBigP("C");                System.exit(0);            } // END main    /* ***************************************************       This method (a procedure) prints a large P using methods       to draw each line in Ps.               String c is the little character to build the big one from    */        public static void printBigP(String c)    {       print4P(c);       print2P(c);       print4P(c);       print1P(c);       print1P(c);    } // END printBigP        /* ***************************************************       This method prints a large 8 using methods       to draw each line in Ps.     */        public static void printBig8(String c)    {       print4P(c);       print2P(c);       print4P(c);       print2P(c);       print4P(c);    } // END printBig8            /* ***************************************************       This method prints a single character as given at the start of the line.    */        public static void print1P(String ch)    {       System.out.println(ch);    } // END print1P                /* ***************************************************       This method prints a four characters as given at the start of the line.    */        public static void print4P(String ch)    {       System.out.println(ch+ch+ch+ch);    } // END print4P                /* ***************************************************       This method prints a 2 characters as given with 2 spaces.    */        public static void print2P(String joe)    {       System.out.println(joe + "  " + joe);    } // END print2P      /* ***************************************************       This method prints a blank line.    */        public static void printBlankLine()    {       System.out.println();    } // END printBlankLine           } // END class printP8Pagain