/*
 * Write a Java program to find if the given number is palindrome or not
 *
 * Example1)
 * C:\>java Sample 110011
 * O/P: 110011 is a palindrome
 *
 * Example2)
 * C:\>java Sample 1234
 * O/P: 1234 is not a palindrome
 */

public class Assignment17 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length > 0) {
            try {
                // Parse the string argument into an integer
                int number = Integer.parseInt(args[0]);
                
                // Store the original number to compare later
                int originalNumber = number;
                int reversedNumber = 0;
                int temp = number;
                
                // Use a while loop to reverse the digits
                while (temp > 0) {
                    int lastDigit = temp % 10;
                    reversedNumber = (reversedNumber * 10) + lastDigit;
                    temp = temp / 10;
                }
                
                // Compare the original number with the reversed number
                if (originalNumber == reversedNumber) {
                    System.out.println(originalNumber + " is a palindrome");
                } else {
                    System.out.println(originalNumber + " is not a palindrome");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide a valid integer.");
            }
        } else {
            System.out.println("Error: Please provide an integer as a command line argument.");
        }
    }
}