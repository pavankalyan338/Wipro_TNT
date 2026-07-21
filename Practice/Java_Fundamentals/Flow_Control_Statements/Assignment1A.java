/*
Write a program to check if a given integer number is Positive, Negative, or Zero.
*/
public class Assignment1A {
    public static void main(String[] args) {
        // Checking if an argument is passed
        if (args.length > 0) {
            try {
                int number = Integer.parseInt(args[0]);
                
                // Flow control to check the number
                if (number > 0) {
                    System.out.println("Positive");
                } else if (number < 0) {
                    System.out.println("Negative");
                } else {
                    System.out.println("Zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide a valid integer.");
            }
        } else {
            System.out.println("Error: Please provide an integer as a command line argument.");
        }
    }
}
