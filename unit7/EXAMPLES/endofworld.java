/*
    AUTHOR Paul Curzon
    DATE 5 November 2020
    VERSION 1

    Define an abstract data type of Timer.
    This version is implemented by keeping a single count of the total seconds left.

    Use it to count down 5 minutes to the end of the world in 10s chunks

*/

class endofworld
{


    // **********************************************************************
    // Use the below Timer ADT
    // Start to count down to the end of the world
    //
    public static void main(String[] args)
    {
        Timer timetoendofworld = createTimer(5,0);

        System.out.println("Time to the end of the world: " +
                           convertTimerToString(timetoendofworld));
    
        while(!timeIsUp(timetoendofworld))
        {
            timetoendofworld = tick10s(timetoendofworld);
            System.out.println("Time to the end of the world: " +
                               convertTimerToString(timetoendofworld));
        }

        System.out.println("They thought it was over...it is now." +
                            "So long and thanks for all the fish...");

        return;
    }



/*  **********************************************************************

    Define an abstract data type of Timer with operations:
      - create a timer set to a given time of minutes and seconds
      - give the current time left in minutes and seconds (as a String)
      - make the timer tick down by one second
      - indicate when the time is up (a boolean)
*/

    // Create a timer given the minutes and seconds the seconds part of the time
    //
    public static Timer createTimer(int mins, int secs)
    { 
        Timer newtimer = new Timer();

        newtimer.totalseconds = mins*60 + secs;
 
        return newtimer;
    }

    // Given a timer return a string giving the time left
    //
    public static String convertTimerToString(Timer t)
    { 
        String time_as_string; 
        int mins = t.totalseconds / 60;
        int secs = t.totalseconds % 60;
    
        time_as_string  = mins + " minutes and " + secs + " seconds";
    
        return time_as_string;
    }

    // Given a timer set it to one second less, returning the new timer
    //
    public static Timer tick(Timer t)
    { 
        t.totalseconds = t.totalseconds - 1;
        
        return t;
    }

    // Given a timer return true if it has reached zero
    //
    public static boolean timeIsUp(Timer t)
    { 
        boolean is_zero;
    
        if (t.totalseconds==0)
            is_zero = true;
        else
            is_zero = false;
        
        return is_zero;
    }


    // Count down in 10 second intervals
    //
    public static Timer tick10s(Timer t)
    {
        for(int i = 1; i<=10; i++)
        {
            tick(t);
        }
    
        return t;
    }


}

class Timer
{
    int totalseconds;
}

