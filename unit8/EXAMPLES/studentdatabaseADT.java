    /* ***************************************************
       AUTHOR Paul Curzon

       This program demonstrates a simple use of abstract data type ideas that will ultimately be used to create a 
       database of student records, that while implemented as an array is presented to the 
       rest of the program with only allowed operations - to add records and to search for a record.
       
       This uses call by reference so changes to arrays and records are done by side effect by mehtods.
    */
import java.util.Scanner;

class studentdatabaseADT
{
    // A simple test method setting student records then finding one and printing it out
    // set its marks and print it out again then print record 0 to see it hasnt changed
    //
   public static void main(String []p)
   {
       int mark1;
       int mark2;
       int ID;
   
       StudentDatabase database2016 = createStudentDatabase(500);
       
       addStudentToDatabase(database2016, "Malala Yousafzai");
       addStudentToDatabase(database2016, "Barack Obama");
       addStudentToDatabase(database2016, "Mahatma Gandhi");
       addStudentToDatabase(database2016, "Martin Luther King");
       addStudentToDatabase(database2016, "Nelson Mandela");
       
       ID = findStudentInDatabase(database2016, "Barack Obama");
       printStudentFromDatabase (database2016, ID);
       
       mark1 = inputInt("Give me their coursework mark");
       mark2 = inputInt("Give me their exam mark");
       
       setStudentMarksInDatabase(database2016, ID, mark1, mark2);
       //check the change has been made
       printStudentFromDatabase (database2016, ID);
       
       for (int i = 0; i<=4; i++)
       {
          printStudentFromDatabase (database2016, i);
       }
      
       System.exit(0);
   }
   
    //    Ask for a string with given message
    //    Return the string typed in by the user
    //
    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
    }

    //    Get an integer typed in by the user
    //
    public static int inputInt(String message)
    {
       return Integer.parseInt(input(message));
    }

    /* ***************************************************

    ** Methods defining a Student Database ADT
    ** These are the only ways we should access a Student Database
    ** Create a new empty Database
    ** Add a new student record
    ** Print a student record given the ID
    ** Find the ID of a student
    ** Add marks to a record given the student ID
    ** Check if a database is full
    **/
    
   // Create a new empty database
   // 
   public static StudentDatabase createStudentDatabase (int SIZE)
   {
     StudentDatabase d = new StudentDatabase();
     Student[] a  = new Student[SIZE];
     
     d.students = a;
     d.nextFreeID = 0;
     return d;
   }

   // Add a student to a database. 
   // Give the name, generate a unique ID
   // 
   public static void addStudentToDatabase (StudentDatabase d, String name)
   { 
     if (isFullDatabase(d))
     {
         System.out.println("Sorry I can't do that as the database is now full");
     }
     else
     {
         int id = getNextFreeID(d);
         Student s = createStudent(name, id);
     
         Student[] students =  getStudents(d);
       
         students[id] = s;
         incrementNextFreeID(d);
     }
     return;
   }

  // Print a formated version of a student record given an id
  //
  public static void printStudentFromDatabase (StudentDatabase d, int studentid)
   { 
      Student s = getStudentFromDatabase(d, studentid);
     
      System.out.println(StudentToString(s));
  
      return;
   }

  // Check if the database is full
  //
  public static boolean isFullDatabase(StudentDatabase d)
   { 
      if (getNextFreeID(d) == getStudents(d).length)
          return true;
      else
          return false;
   }
   
  // Find a student in the database given his or her name
  // Return the student's ID or -1 if not known
  // 
  public static int findStudentInDatabase(StudentDatabase d, String studentname)
  { 
      int LAST = getNextFreeID(d);
      
      for(int i=0; i< LAST; i++)
      {
         Student s = getStudentFromDatabase(d, i);
         if(getName(s).equals(studentname))
              return i;
      }
      
      return -1;
   }

   // Set the marks of a student
   //   
   public static void setStudentMarksInDatabase(StudentDatabase d, int studentid, int mark1, int mark2)
   { 
      Student s = getStudentFromDatabase(d, studentid);
      setMarks (s, mark1, mark2);
  
      return;
   }


/* ******************************************************** 
   The following methods are only for use in defining the abstract data type methods.
   ******************************************************** */

   // Extract a whole student record from the database given the ID
   //
   public static Student getStudentFromDatabase(StudentDatabase d, int studentid)
   { 
      Student [] a = getStudents(d);
      Student s = a[studentid];
  
      return s;
   }
   
   // Get the array of all students from the database
   //
   public static Student[] getStudents(StudentDatabase d)
   { 
       return d.students;
   }

   // Get the next free ID from the database
   // It also gives the number of students stored
   //
   public static int getNextFreeID(StudentDatabase d)
   { 
       return d.nextFreeID;
   }

   // Increment the next free ID of a given database
   //
   public static void incrementNextFreeID(StudentDatabase d)
   { 
       d.nextFreeID = d.nextFreeID + 1;
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
   public static String StudentToString (Student s)
   {
     String message = getId(s) + "\t" + getName(s) + "\t" + getMark(s);
     return message;
   }

    // Getter methods for Student record type
    // Return the name from a student record
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
   // The marks are set to 0.
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

    // Set the mark of a student by giving exam and coursework mark /50 
    //
   public static void setMarks (Student s, int smark1, int smark2)
   {
     s.courseworkmark = smark1;
     s.exammark = smark2;
     return;
   }
   
} //END class studentdatabaseadt

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


/* *************************************************** */
/* *************************************************** */

	
    /* ***************************************************
       Create a new type (a record) called StudentDatabase that records student data
       A database is an array and the next unused student id.
    */
class StudentDatabase
{
   Student[] students; // The database data
   int nextFreeID;   // The next free student ID 
} // END class StudentDaase
