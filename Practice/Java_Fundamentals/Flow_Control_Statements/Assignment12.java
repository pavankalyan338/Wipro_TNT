/*
 * Write a program to check if a given number is prime or not.
 */

public class Assignment12 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length > 0) {
            try {
                // Parse the string argument into an integer
                int number = Integer.parseInt(args[0]);
                boolean isPrime = true;
                
                // Numbers less than or equal to 1 are not prime numbers
                if (number <= 1) {
                    isPrime = false;
                } else {
                    // Loop to check if the number is divisible by any integer other than 1 and itself
                    for (int i = 2; i <= number / 2; i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break; // Exit the loop as soon as we find a factor
                        }
                    }
                }
                
                // Print the result
                if (isPrime) {
                    System.out.println(number + " is a prime number");
                } else {
                    System.out.println(number + " is not a prime number");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide a valid integer.");
            }
        } else {
            System.out.println("Error: Please provide an integer as a command line argument.");
        }
    }
}