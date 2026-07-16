/*
 * Write a program to receive a color code from the user (an Alphabhet). 
 *
 * The program should then print the color name, based on the color code given. 
 *
 * The following are the color codes and their corresponding color names.
 * R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 
 *
 * If color code provided by the user is not valid then print "Invalid Code".
 */

public class Assignment8 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length > 0) {
            // Extract the first character from the input and convert to uppercase
            // This ensures both lowercase 'r' and uppercase 'R' work correctly
            char code = args[0].toUpperCase().charAt(0);
            
            // Switch statement to print the corresponding color name
            switch (code) {
                case 'R':
                    System.out.println("Red");
                    break;
                case 'B':
                    System.out.println("Blue");
                    break;
                case 'G':
                    System.out.println("Green");
                    break;
                case 'O':
                    System.out.println("Orange");
                    break;
                case 'Y':
                    System.out.println("Yellow");
                    break;
                case 'W':
                    System.out.println("White");
                    break;
                default:
                    System.out.println("Invalid Code");
                    break;
            }
        } else {
            System.out.println("Error: Please provide a color code as a command line argument.");
        }
    }
}