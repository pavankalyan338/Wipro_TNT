/*
 * Initialize two character variables in a program and display the characters in alphabetical order.
 *
 * Example1) if the first character is 's' and second character is 'e' then the output should be  e,s
 * Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
 */

public class Assignment4 {
    public static void main(String[] args) {
        // Initialize two character variables
        char char1 = 's';
        char char2 = 'e';
        
        // Compare the ASCII values of the characters to determine alphabetical order
        if (char1 < char2) {
            System.out.println(char1 + "," + char2);
        } else {
            System.out.println(char2 + "," + char1);
        }
    }
}