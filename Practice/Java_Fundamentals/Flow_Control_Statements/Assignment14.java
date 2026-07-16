/*
 * Write a program to print the sum of all the digits of a given number.
 *
 * Example1) 
 * I/P:1234
 * O/P:10
 */

public class Assignment14 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length > 0) {
            try {
                // Parse the string argument into an integer
                int number = Integer.parseInt(args[0]);
                int sum = 0;
                
                // Use Math.abs to handle negative numbers properly
                // The loop extracts the last digit, adds it to the sum, and removes it from the number
                for (int temp = Math.abs(number); temp > 0; temp /= 10) {
                    int lastDigit = temp % 10;
                    sum += lastDigit;
                }
                
                // Print the final sum
                System.out.println(sum);
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide a valid integer.");
            }
        } else {
            System.out.println("Error: Please provide an integer as a command line argument.");
        }
    }
}