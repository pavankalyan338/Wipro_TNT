package Practice.OOPS_Inheritance.Strings_StringBuffer;

import java.util.Scanner;

/*
 * Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
 * 
 * Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
 * 
 * Example1)
 * i/p:Sachin,Tendulkar
 * o/p:sachin tendulkar
 * 
 * Example2)
 * i/p:Mark,kate
 * o/p:markate
 */

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two strings separated by a comma (e.g., Sachin,Tendulkar):");
        String input = sc.nextLine();
        
        // Split the input based on the comma
        String[] parts = input.split(",");
        
        if (parts.length < 2) {
            System.out.println("Error: Please provide two strings separated by a comma.");
            sc.close();
            return;
        }
        
        String str1 = parts[0].trim();
        String str2 = parts[1].trim();
        
        String result = "";
        
        // Check if both strings are non-empty and if a double-character boundary condition exists
        if (str1.length() > 0 && str2.length() > 0 && 
            Character.toLowerCase(str1.charAt(str1.length() - 1)) == Character.toLowerCase(str2.charAt(0))) {
            
            // Omit one of the overlapping characters (sub-string excludes the last character of str1)
            result = str1.substring(0, str1.length() - 1) + str2;
        } else {
            // Otherwise, concatenate with a space if it follows the first example style, 
            // or directly if it's a standard combination. 
            // To be precise with Wipro's edge cases, we check if a space is needed or just direct concatenation.
            // Let's implement direct concatenation but handle standard formatting.
            if (input.contains(", ")) {
                result = str1 + " " + str2;
            } else {
                result = str1 + str2;
            }
        }
        
        // Print the final result converted strictly to lowercase
        System.out.println("o/p: " + result.toLowerCase());
        
        sc.close();
    }
}