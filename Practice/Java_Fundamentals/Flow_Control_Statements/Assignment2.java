/*
 * Write a program to check if a given integer number is odd or even.
 */

public class Assignment2 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length > 0) {
            try {
                // Parse the string argument into an integer
                int number = Integer.parseInt(args[0]);
                
                // Check if the number is perfectly divisible by 2
                if (number % 2 == 0) {
                    System.out.println("The number " + number + " is even.");
                } else {
                    System.out.println("The number " + number + " is odd.");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide a valid integer.");
            }
        } else {
            System.out.println("Error: Please provide an integer as a command line argument.");
        }
    }
}