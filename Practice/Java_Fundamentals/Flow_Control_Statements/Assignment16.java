/*
 * Write a program to reverse a given number and print
 *
 * Example1)
 * I/P: 1234
 * O/P:4321
 *
 * Example2)
 * I/P:1004
 * O/P:4001
 */

public class Assignment16 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length > 0) {
            try {
                // Parse the string argument into an integer
                int number = Integer.parseInt(args[0]);
                int reversedNumber = 0;
                
                // Store the absolute value to handle negatives properly
                int temp = Math.abs(number);
                
                // Use a while loop to reverse the digits
                while (temp > 0) {
                    int lastDigit = temp % 10;
                    reversedNumber = (reversedNumber * 10) + lastDigit;
                    temp = temp / 10;
                }
                
                // Restore the negative sign if the original number was negative
                if (number < 0) {
                    reversedNumber = -reversedNumber;
                }
                
                // Print the reversed number
                System.out.println(reversedNumber);
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide a valid integer.");
            }
        } else {
            System.out.println("Error: Please provide an integer as a command line argument.");
        }
    }
}