import java.util.Scanner;

/*
 * Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *
 * 
 * Example1)
 * i/p:ab*cd
 * o/p:ad
 */

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string containing *: ");
        String str = sc.nextLine();
        
        // Handle edge case for null or empty input
        if (str == null || str.isEmpty()) {
            System.out.println("o/p: ");
            sc.close();
            return;
        }
        
        StringBuilder result = new StringBuilder();
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            // Check if current character is '*'
            if (str.charAt(i) == '*') {
                continue;
            }
            
            // Check if the character to the right is '*'
            if (i < len - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            
            // Check if the character to the left is '*'
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            
            // If it's not a star, and not adjacent to a star, keep it
            result.append(str.charAt(i));
        }
        
        // Print the cleaned output string
        System.out.println("o/p: " + result.toString());
        
        sc.close();
    }
}