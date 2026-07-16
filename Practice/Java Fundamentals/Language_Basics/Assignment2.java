/*
Write a Program to accept a String as a command line argument and print a Welcome message as given below.

Example1)
C:> java Sample John
O/P Expected : Welcome John
*/
public class Assignment2 {
    public static void main(String[] args) {
        // Check if at least one argument is passed
        if (args.length >= 1) {
            String name = args[0];
            
            // Print the welcome message
            System.out.println("Welcome " + name);
        } else {
            System.out.println("Error: Please provide a name as a command line argument.");
        }
    }
}
