/*
 * Initialize a character variable in a program and 
 * print 'Alphabhet' if the initialized value is an alphabhet, 
 * print 'Digit' if the initialized value is a number, and 
 * print 'Special Character', if the initialized value is anything else.
 */

public class Assignment5 {
    public static void main(String[] args) {
        // Initialize a character variable
        char ch = '*'; // Change this value to test different characters!
        
        // Check if the character is an alphabet letter
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabhet");
        } 
        // Check if the character is a digit
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } 
        // If it is neither an alphabet nor a digit, it is a special character
        else {
            System.out.println("Special Character");
        }
    }
}