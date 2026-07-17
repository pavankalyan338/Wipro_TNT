package Practice.OOPS_Inheritance.Strings_StringBuffer;

import java.util.Scanner;

/*
 * Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
 * You may assume that n is between 0 and the length of the string, inclusive. 
 * 
 * Example1)
 * i/p:Wipro,3
 * o/p:propropro
 */

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string and an integer separated by a comma (e.g., Wipro,3):");
        String input = sc.nextLine();
        
        // Split the input based on the comma delimiter
        String[] parts = input.split(",");
        
        if (parts.length < 2) {
            System.out.println("Error: Please provide both a string and an integer separated by a comma.");
            sc.close();
            return;
        }
        
        String str = parts[0].trim();
        int n;
        
        // Parse the integer safely
        try {
            n = Integer.parseInt(parts[1].trim());
        } catch (NumberFormatException e) {
            System.out.println("Error: The second value must be a valid integer.");
            sc.close();
            return;
        }
        
        // Validate constraints
        if (n < 0 || n > str.length()) {
            System.out.println("Error: n must be between 0 and the length of the string.");
            sc.close();
            return;
        }
        
        // Extract the last n characters from the string
        String lastNChars = str.substring(str.length() - n);
        
        // Construct the repeated sequence
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        
        // Print the output
        System.out.println("o/p: " + result.toString());
        
        sc.close();
    }
}