/*
 * Write a class MathOperation which accepts 5 integers through command line. 
 * Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result. 
 * 
 * Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
 */

public class Assignment2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;

        try {
            // Check if exactly 5 arguments are passed
            if (args.length != 5) {
                throw new IllegalArgumentException("Please pass exactly 5 integer arguments.");
            }

            // Parse elements and compute sum
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }

            // Calculate average
            double average = (double) sum / numbers.length;

            System.out.println("Sum of elements: " + sum);
            System.out.println("Average of elements: " + average);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: All arguments must be valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division error occurred.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}