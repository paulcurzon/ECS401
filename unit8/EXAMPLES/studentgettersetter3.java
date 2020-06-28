    /* ***************************************************
       AUTHOR Paul Curzon

       This program demonstrates a simple use of records, accessed by getter and setter methods
       It shows hwo they allow us to change the implementation of the data type without changing
       other parts of the program - only the getter and setter methods for the part changed.
       This version stores both coursework and exam mark not just the total in the record.
       
       It demonstrates how you do not need to return records passed as arguments as due to
       pass by reference parameter passing any changes are made to the passed object.
       
       It creates a new (empty) Student record, fills it with data then prints that data out 
       
       Modify it to print coursework and exam marks by adding getter methods for them.
       
    */
class studentgettersetter3
{

   public static void main(String []p)
   {
       createandprintstudent();
       
       System.exit(0);
   }
   
    // A simple test method setting a student record then printing it out
   public static void createandprintstudent()
   {
       Student s1 = new Student();
       int mark1 = 40;
       int mark2 = 49;

       setName(s1,"Paul Curzon");
       setId(s1, "4509930");
       setMark2(s1, mark1, mark2);
       System.out.println(getId(s1) + " " + getName(s1) + " " + getMark(s1));
       
       return;
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
   // Set the id of a student
   public static void setId (Student s, String studentid)
   {
     s.id = studentid;
     return;
   }

 
    // Set the name of a student
   public static void setName (Student s, String studentname)
   {
     s.name = studentname;
     return;
   }
    // Set the mark of a student by giving exam and coursework mark /50 returning the updated record
    // The two marks are just added to give the overall final mark
   public static void setMark2 (Student s, int smark1, int smark2)
   {
     s.courseworkmark = smark1;  // WE CHANGED THIS
     s.exammark = smark2;
     return;
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