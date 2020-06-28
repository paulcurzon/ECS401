/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - integers and assignments

Doing an assignment of two integer variables copies values
They are still distinct variables.
 
******************************************** */

class experiment2 
{
    public static void main (String param[]) 
    {
        int a=0;
        System.out.println("a: " + a);


        int b=1;
        System.out.println("b: " + b);

        System.out.println("do b=a;");

        b=a;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        System.out.println("Change a: a=2;");

        a=2;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        System.out.println("Change b: b=3;");

        b=3;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
}
