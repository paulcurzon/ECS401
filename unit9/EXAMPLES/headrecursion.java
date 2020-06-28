/* AUTHOR Paul Curzon

A Head recursive program

This prints from 0 to n
 
*/
class headrecursion
{

    public static void main (String param[]) 
    {
       print0toN(10);
    }
  
    // print numbers from N to 0
    public static void print0toN(int n)
    {
       if (n == -1)
            return;
       else
       {
           print0toN(n-1);
           System.out.println(n);
           return;
        }
     }
}