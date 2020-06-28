    /* ***************************************************
       AUTHOR Paul Curzon

       This program demonstrates a very simple use of records, creating a new type
       to represent student data that groups different information about a single
       student in a way so that it can be stored in a single variable.
       
       It creates a new (empty) Student record, fills it with data then prints that data out 
       
    */
class studentrecord
{

   public static void main(String []p)
   {
       createandprintstudent();
       
       System.exit(0);
   }
   
   
   public static void createandprintstudent()
   {
       Student s1 = new Student();

       s1.name = "Paul Curzon";
       s1.id = "4509930";
       s1.mark = 89;
       System.out.println(s1.id + " " + s1.name + " " + s1.mark);
       
       return;
   }
} //END class studentrecord


	
    /* ***************************************************
       Create a new type (a record) called Student that records student data
    */

class Student
{
   String name; // The Students full name
   String id;   // Their unique ID number
   int mark;    // their final total mark
} // END class Student