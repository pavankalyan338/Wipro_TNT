/*
 * Write a program to print even numbers between 23 and 57. 
 * Each number should be printed in a separate row.
 */

public class Assignment11 {
    public static void main(String[] args) {
        // Loop through the numbers between 23 and 57
        for (int i = 23; i <= 57; i++) {
            // Check if the number is perfectly divisible by 2 (meaning it is even)
            if (i % 2 == 0) {
                // Print the even number on a new line
                System.out.println(i);
            }
        }
    }
}