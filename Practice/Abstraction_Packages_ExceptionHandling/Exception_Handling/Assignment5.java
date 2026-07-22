/*
 * Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
 * Display proper error messages. 
 * 
 * The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 * (Hint : Create a user defined exception class for handling errors.)
 */

// Custom Exception class for handling invalid age inputs
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        try {
            // Validate that both arguments (Name and Age) are provided
            if (args.length < 2) {
                System.out.println("Error: Please provide both Name and Age as command line arguments.");
                System.out.println("Usage: java Assignment5 <Name> <Age>");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]); // May throw NumberFormatException

            // Validate age range
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("InvalidAgeException: Age must be >= 18 and < 60. Provided age: " + age);
            }

            // Display success message
            System.out.println("Registration Successful!");
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Age must be a valid integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}