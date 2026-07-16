/*
 * Write a program to check if the program has received command line arguments or not.
 * * If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)
 * * Example1) java Example
 * O/P: No values
 * * Example2) java Example Mumbai Bangalore
 * O/P: Mumbai,Bangalore
 * * [Hint: You can use length property of an array to check its length]
 */

public class Assignment3 {
    public static void main(String[] args) {
        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Loop through the arguments and print them separated by a comma
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                
                // Add a comma after every argument except the last one
                if (i < args.length - 1) {
                    System.out.print(",");
                }
            }
            // Add a new line at the very end for cleaner output
            System.out.println();
        }
    }
}