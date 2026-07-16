/*
 * Write a program to print prime numbers between 10 and 99.
 */

public class Assignment13 {
    public static void main(String[] args) {
        // Loop through the numbers between 10 and 99
        for (int i = 10; i <= 99; i++) {
            boolean isPrime = true;
            
            // Check if the current number 'i' is prime
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Exit the inner loop if a factor is found
                }
            }
            
            // If the number is prime, print it
            if (isPrime) {
                // Printing on a single line separated by spaces for easier reading
                System.out.print(i + " "); 
            }
        }
        
        // Add a new line at the very end
        System.out.println();
    }
}