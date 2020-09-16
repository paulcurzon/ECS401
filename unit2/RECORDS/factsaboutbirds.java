/* *****************************************
@author Paul Curzon
@version 1
@date 27 July 2020

	A program to illustrate Simple use of records 
	including use of procedures and functions.
	
	Store details about birds and then print them in a consistent format.
******************************************** */


// Create a new type Bird to hold details of different birds.
//
class Bird
{
    String name;
    int wing_span;
    int length;
    String colour;
}


// Store details about different birds and then print them in a consistent way.
// 
class factsaboutbirds
{
    public static void main(String[] p)
    {

        birdDetails();
        
        System.exit(0);
    }

    // Create some example birds and print the details stored about them.
    //
    public static void birdDetails()
    {
        Bird albatross = createBird("Wandering Albatross", 305, 135, "white with black wing tips");     
        Bird kite = createBird("Red Kite", 165, 66, "rust red");
                
        printBirdDetails(albatross);
        printBirdDetails(kite);

        return;
    }
    
    // Print all the known details about a Bird given a Bird record.
    //    
    public static void printBirdDetails(Bird b)
    {
        System.out.println("The " + b.name + " is of length " + b.length + "cm");
        System.out.println("and has a wing span of " + b.wing_span + "cm.");
        System.out.println("It is coloured " + b.colour + ".");
        System.out.println();

        return;
    }

    // Create a bird record b and set the fields with the given values, returning the completed record value
    //
    public static Bird createBird(String given_name, int given_wing_span, int given_length, String given_colour)
    {
        Bird b = new Bird();
        
        b.name = given_name;
        b.wing_span = given_wing_span;
        b.length = given_length;
        b.colour = given_colour;

        return b;
    }

}