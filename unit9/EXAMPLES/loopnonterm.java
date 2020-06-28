class loopnonterm
{

    //  a silly method that calls itself
    //  notice there is no if statement to give a base case to get out
    // Explain why "finished!" is never printed.
    // Eventually it crashes as the computer runs out of memory 
    // scroll back up the terminal window to see
    //recursive calls use memory  with every call that isnt returned from.
    public static void myloop ()
    {
        System.out.println("tick...");
        myloop();
        return;
    }

    public static void main (String param[]) 
    {

        System.out.println("starting...");
        myloop();
        System.out.println("finished!");
        System.exit(0);
    }
}
