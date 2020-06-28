    /* ***************************************************
       AUTHOR Paul Curzon

       This program demonstrates how you can have arrays inside records.
       
       Notice how again we take advantage of the abstract data type (ADT)
       way of implementing this - we can swap one array field for the previous
       two mark fields and apart from getter and setter methods nothing else needs
       to change.
       
       Note this is NOT the same as an array of ADTs which is a way of storing
       lots of Student records. See other examples for that.
    */
import java.util.Scanner;


class arrayinsidestudentadt
{

    // A simple test method setting a student record then printing it out

   public static void main(String []p)
   {
       Student s0 = createStudent("Martin Luther King", 3921072);
       System.out.println(StudentToString(s0));
       Student s1 = createStudent("Barack Obama", 4509930);
       int mark1 = inputInt("Give me Barack's coursework mark");
       int mark2 = inputInt("Give me Barack's exam mark");

       s1 = setMarks(s1, mark1, mark2);
       System.out.println(StudentToString(s1));
       
       System.exit(0);
   }
   
/* *********************************
    Ask for a string with given message
    Return the string typed in by the user
*/ 
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
    }

    public static int inputInt(String message)
    {
       return Integer.parseInt(input(message));
    }

    /* ***************************************************

    ** Methods defining a Student ADT
    ** Theses are the only ways we should access a Student
    ** Get a student record as a formatted string
    ** Get a student name
    ** Get a student ID
    ** Get a student's combined mark
    ** Create a student record
    ** Set the marks for a student
    **/
    
    // Convert a student record to a printable string
    //
   public static String StudentToString (Student s)
   {
     String message = getId(s) + "\t" + getName(s) + "\t" + getMark(s);
     return message;
   }

    // Getter methods for Student record type
    // Return the name from a student record
    //
   public static String getName (Student s)
   {
     return s.name;
   }

    // Return the id from a student record
   public static int getId (Student s)
   {
     return s.id;
   }

    // Return the total mark from a student record
    // This is the only mark accessible
   public static int getMark (Student s)
   {
     return (s.marks[0] + s.marks[1]); // WE CHANGED THIS
   }

    // To create a student BOTH a name and ID must be set at the same time
    // The marks are set to 0 to mean no mark set.
    //
   public static Student createStudent (String studentname, int studentid)
   {
     Student s = new Student();
     int [] ms = new int[2]; // allocate the array space for the marks field
     
     s.name = studentname;
     s.id = studentid;
     
     for (int i = 0; i<2; i++)
     {
        ms[i] = 0;
     }
     
     s.marks = ms; // store the newly allocated array value in the marks field 
     
     return s;
   }

    // Set the mark of a student by giving exam and coursework mark /50 returning the updated record
    //
   public static Student setMarks (Student s, int smark1, int smark2)
   {
     s.marks[0] = smark1;
     s.marks[1] = smark2;
     return s;
   }
   
} //END class studentrecord

/* *************************************************** */
/* *************************************************** */

	
    /* ***************************************************
       Create a new type (a record) called Student that records student data
       A student has a name and an ID and two marks.
    */

class Student
{
   String name; // The Students full name
   int id;   // Their unique ID number
   int [] marks;    // their marks /50
} // END class Student