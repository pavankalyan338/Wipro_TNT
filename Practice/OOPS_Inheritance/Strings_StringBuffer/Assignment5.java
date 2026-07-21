import java.util.Scanner;

/*
 * Write a java program that accepts a string and returns a new string without the first and last character of the input string.
 * 
 * Example1)
 * i/p:Suman
 * o/p:uma
 */

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        // Handle edge case if the string is empty or too short to strip characters from
        if (str == null || str.length() <= 2) {
            System.out.println("o/p: ");
        } else {
            // Extract the substring starting from index 1 up to (but excluding) the last index
            String result = str.substring(1, str.length() - 1);
            System.out.println("o/p: " + result);
        }
        
        sc.close();
    }
}