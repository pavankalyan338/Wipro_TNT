import java.util.Scanner;

/*
 * Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
 * 
 * Example1)
 * i/p:Wipro
 * o/p:WiWiWiWiWi
 */

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        int n = str.length();
        
        // Handle edge case for empty input
        if (n == 0) {
            System.out.println("o/p: ");
            sc.close();
            return;
        }
        
        // Extract the first 2 characters (or the whole string if it's shorter than 2 chars)
        String repeatingPart = (n < 2) ? str : str.substring(0, 2);
        
        // Use a StringBuilder to efficiently construct the repeated pattern
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(repeatingPart);
        }
        
        // Print the final output
        System.out.println("o/p: " + result.toString());
        
        sc.close();
    }
}