/*
 * Write a program to print * in Floyds format (using for and while loop)
 * *
 * * *
 * * * *
 *
 * Example1)
 * C:\>java Sample 
 * O/P: Please enter an integer number
 *
 * Example2)
 * C:\>java Sample 3
 * O/P :
 * *
 * * * * * * *
 */

public class Assignment15 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
        } else {
            try {
                // Parse the string argument into an integer
                int rows = Integer.parseInt(args[0]);
                
                // Outer loop handles the number of rows
                for (int i = 1; i <= rows; i++) {
                    // Inner loop handles the number of stars in each row
                    for (int j = 1; j <= i; j++) {
                        // Print a star followed by a space
                        System.out.print("* ");
                    }
                    // Move to the next line after printing all stars for the current row
                    System.out.println();
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer number");
            }
        }
    }
}