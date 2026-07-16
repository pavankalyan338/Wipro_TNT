/*
 * Write a program to print numbers from 1 to 10 in a single row with one tab space.
 */

public class Assignment10 {
    public static void main(String[] args) {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Print the number followed by a tab space (\t)
            System.out.print(i + "\t");
        }
        
        // Add a new line at the end for cleaner terminal output
        System.out.println();
    }
}