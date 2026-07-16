/*
Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30
*/
public class Assignment3 {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length == 2) {
            try {
                // Parse the string arguments into integers
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                
                // Calculate the sum
                int sum = num1 + num2;
                
                // Print the output in the expected format
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide valid integers as arguments.");
            }
        } else {
            System.out.println("Error: Please provide exactly two integers as command line arguments.");
        }
    }
}
