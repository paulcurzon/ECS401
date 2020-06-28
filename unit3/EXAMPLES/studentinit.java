    /* ***************************************************
       AUTHOR Paul Curzon

       This program demonstrates a simple use of records, accessed by getter and setter methods
       It shows hwo they allow us to change the implementation of the data type without changing
       other parts of the program - only the getter and setter methods for the part changed.
       
       This version stores both coursework and exam mark not just the total in the record.
       It also uses initialisation and toString methods.
       
       It creates a new (empty) Student record, fills it with data then prints that data out 
       
       Modify it to print coursework and exam marks by adding getter methods for them.
       
    */
class studentinit
{

   public static void main(String []p)
   {
       createandprintstudent();
       
       System.exit(0);
   }
   
    // A simple test method setting a student record then printing it out
   public static void createandprintstudent()
   {
       int mark1 = 40;
       int mark2 = 49;
       Student s1 = initStudent("Paul Curzon", "4509930", mark1, mark2);

       System.out.println(studentToString(s1));
       
       return;
   }

   // Create and Initialise a Student.
   public static Student initStudent(String studentname, String studentid, int mark1, int mark2)
   {
       Student s = new Student();

       s = setName(s, studentname);
       s = setId(s, studentid);
       s = setMark(s, mark1, mark2);

       return s;
   }


    // Convert a Student record details to a String eg for printing.
    // Places spaces between the fields.   
   public static String studentToString(Student s)
   {
       String result = getId(s) + " " + getName(s) + " " + getMark(s);

       return result;
   }

   
    // Getter methods for Student record type
    // Return the name from a student record
   public static String getName (Student s)
   {
     return s.name;
   }

    // Return the id from a student record
   public static String getId (Student s)
   {
     return s.id;
   }

    // Return the total mark from a student record
   public static int getMark (Student s)
   {
     return (s.exammark + s.courseworkmark); // WE CHANGED THIS
   }

   // Setter methods for Student record type
   // Set the id of a student returning the updated record
   public static Student setId (Student s, String studentid)
   {
     s.id = studentid;
     return s;
   }

 
    // Set the name of a student returning the updated record
   public static Student setName (Student s, String studentname)
   {
     s.name = studentname;
     return s;
   }
    // Set the mark of a student by giving exam and coursework mark /50 returning the updated record
    // The two marks are just added to give the overall final mark
   public static Student setMark (Student s, int smark1, int smark2)
   {
     s.courseworkmark = smark1;  // WE CHANGED THIS
     s.exammark = smark2;
     return s;
   }
   
} //END class studentrecord

/* *************************************************** */
/* *************************************************** */

	
    /* ***************************************************
       Create a new type (a record) called Student that records student data
       We've changed the implementation here to store both marks
       This will us to add more functionality to access the separate marks (not done here)
    */

class Student
{
   String name; // The Students full name
   String id;   // Their unique ID number
   int courseworkmark;    // their coursework mark /50  // WE CHANGED THIS FROM A SINGLE MARK
   int exammark;         // their exam mark /50
} // END class Student