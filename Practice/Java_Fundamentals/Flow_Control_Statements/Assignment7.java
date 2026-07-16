/*
 * Initialize a character variable with an alphabhet in a program.
 *
 * If the character value is in lowercase, the output should be displayed in uppercase in the following format.
 *
 * Example1)
 * i/p:a
 * o/p:a->A
 *
 * If the character value is in uppercase, the output should be displayed in lowercase in the following format.
 *
 * Example2)
 * i/p:A
 * o/p:A->a
 */

public class Assignment7 {
    public static void main(String[] args) {
        // Initialize a character variable
        char ch = 'a'; // Change this value to 'A' or other letters to test it!
        
        // Check if the character is lowercase
        if (Character.isLowerCase(ch)) {
            // Convert to uppercase and print in the specified format
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } 
        // Check if the character is uppercase
        else if (Character.isUpperCase(ch)) {
            // Convert to lowercase and print in the specified format
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } 
        // Handle cases where the initialized character is not an alphabet
        else {
            System.out.println("Error: The initialized character is not an alphabet.");
        }
    }
}