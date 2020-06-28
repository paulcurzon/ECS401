    /* ***************************************************
       AUTHOR Paul Curzon

       This program demonstrates a simple use of abstract data type ideas that will ultimately be used to create a 
       database of student records, that while implemented as an array is presented to the 
       rest of the program with only allowed operations - to add records and to search for a record.
       
       Stores both coursework and exam mark not the total in the record.
       Both name and id must be provided when creating a record to ensure it is valid
    */
import java.util.Scanner;


class studentadt
{

    // A simple test method setting a student record then printing it out

   public static void main(String []p)
   {
       Student s0 = createStudent("Martin Luther King", 3921072);
       System.out.println(StudentToString(s0));
       Student s1 = createStudent("Barack Obama", 4509930);
       int mark1 = inputInt("Give me their coursework mark");
       int mark2 = inputInt("Give me their exam mark");

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
     return (s.exammark + s.courseworkmark); // WE CHANGED THIS
   }

    // To create a student BOTH a name and ID must be set at the same time
    // The marks are set to 0 to mean no mark set.
    //
   public static Student createStudent (String studentname, int studentid)
   {
     Student s = new Student();
     
     s.id = studentid;
     s.name = studentname;
     s.courseworkmark = 0;
     s.exammark = 0;

     return s;
   }

    // Set the mark of a student by giving exam and coursework mark /50 returning the updated record
    //
   public static Student setMarks (Student s, int smark1, int smark2)
   {
     s.courseworkmark = smark1;
     s.exammark = smark2;
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
   int courseworkmark;    // their coursework mark /50
   int exammark;         // their exam mark /50
} // END class Student