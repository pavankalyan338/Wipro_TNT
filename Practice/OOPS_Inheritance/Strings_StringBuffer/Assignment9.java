package Practice.OOPS_Inheritance.Strings_StringBuffer;

import java.util.Scanner;

/*
 * Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
 * Any characters left, will go to the end of the result.
 * 
 * Example1)
 * i/p:Hello,World
 * o/p:HWeolrllod
 */

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two strings separated by a comma (e.g., Hello,World):");
        String input = sc.nextLine();
        
        // Split the input based on the comma delimiter
        String[] parts = input.split(",");
        
        if (parts.length < 2) {
            System.out.println("Error: Please provide two strings separated by a comma.");
            sc.close();
            return;
        }
        
        String a = parts[0].trim();
        String b = parts[1].trim();
        
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        
        // Loop through up to the length of the longer string
        for (int i = 0; i < maxLength; i++) {
            // Append character from string 'a' if it exists at this index
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            // Append character from string 'b' if it exists at this index
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }
        
        // Print the interleaved result string
        System.out.println("o/p: " + result.toString());
        
        sc.close();
    }
}