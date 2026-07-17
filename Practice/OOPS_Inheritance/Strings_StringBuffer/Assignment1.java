package Practice.OOPS_Inheritance.Strings_StringBuffer;

import java.util.Scanner;

/*
 * Write a Program to check whether a given String is Palindrome or not.
 */

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = sc.nextLine();
        
        // Handle edge case for empty input
        if (str == null || str.trim().isEmpty()) {
            System.out.println("Please enter a valid string.");
            sc.close();
            return;
        }
        
        // Using StringBuffer's built-in reverse method to check cleanly
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        
        // Check if the original string matches the reversed version (case-sensitive)
        if (str.equals(reversedStr)) {
            System.out.println("Output: The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("Output: The string \"" + str + "\" is NOT a palindrome.");
        }
        
        sc.close();
    }
}