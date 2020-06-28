    /* ***************************************************
       AUTHOR Paul Curzon
       
       Illustrates
       - Abstract Data Types
       - Queues
       
       This program implements a simple form of Queue abstract data type with operations
       - createEmptyQueue
       - joinQueue
       - leaveQueue
       
       The main method illustrates its use with a queue of Olympians joining and leaving.
       Try different sequences of joining and leaving to check it makes sure they queue properly!
       
       Change the implementation in various ways to see how the use of the queue (main method) 
       is unchanged eg
       - to store the position of the last person in the queue rather than the number in the queue
       - to one where the queue wraps around so the front of the queue moves along the array rather
       than spending time shuffling everyone up
       
       This version shows how records are modified by methods they are passed to and so do not need to 
       return the queue itself as a result as its changed as a side effect dur to call by reference 
       style parameter passing
       This version combines leaveQueue with firstInQueue of previous versions

    */
class queueprogram3
{

   public static void main(String []p)
   {
       Queue q = createEmptyQueue(10);
       joinQueue(q,"Alistair Brownlee");
       System.out.println(leaveQueue(q));
       joinQueue(q,"Mo Farah");
       System.out.println(leaveQueue(q));
       joinQueue(q,"Laura Trott");
       joinQueue(q,"Nicola Adams");
       joinQueue(q,"Amir Khan");
       System.out.println(leaveQueue(q));
       System.out.println(leaveQueue(q));
       System.out.println(leaveQueue(q));
              
       System.exit(0);
   }
   
    // Create an empty queue of a given size
   public static Queue createEmptyQueue(int size)
   {
       Queue q = new Queue ();
       String [] a = new String[size];
       q.entries = a;
       q.numberqueueing = 0;
       return q;
    }
   
   // add given string to the back of the queue
   // In this implementation it is just the nextfree position as stored
   // Do nothing if queue full
   public static void joinQueue(Queue q, String newentry)
   {
        if (q.numberqueueing < q.entries.length)  // Still space
       {
            q.entries[q.numberqueueing] = newentry;
            q.numberqueueing = q.numberqueueing + 1;
        }
        return;
   }
 
   // remove the front of the queue
   // In this implementation it is just the first entry
   // return the element removed
   public static String leaveQueue(Queue q)
   {
       String front = q.entries[0]; // save so can return
       if (q.numberqueueing != 0) // queue is not empty
       {
           for (int i = 0; i < q.numberqueueing; i++)
           {
              q.entries[i] = q.entries[i + 1]; // Shuffle all entries down
           }
           q.numberqueueing = q.numberqueueing - 1;
       }
       return front;
   }
 
} //END class QueueProgram

/* *************************************************** */
/* *************************************************** */

	
    /* ***************************************************
       Create a new type (a record) called Queue that acts as a first in first out queue
    */

class Queue
{
   String [] entries; // Where the queued values are stored
   int numberqueueing;   // The number of entries currently in the queue
} // END class Queue