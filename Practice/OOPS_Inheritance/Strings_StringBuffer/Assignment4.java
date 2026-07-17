package Practice.OOPS_Inheritance.Strings_StringBuffer;

import java.util.Scanner;

/*
 * Write a java program that will return the first half of the string, if the length of the string is even. 
 * It should return null for odd length string.
 * 
 * Example1)
 * i/p:TomCat
 * o/p:Tom
 * 
 * Example2)
 * i/p:Apron
 * o/p:null
 */

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        // Handle edge case for an empty input
        if (str == null || str.isEmpty()) {
            System.out.println("o/p: ");
            sc.close();
            return;
        }
        
        // Check if the length of the string is even
        if (str.length() % 2 == 0) {
            // Extract the first half of the string
            String firstHalf = str.substring(0, str.length() / 2);
            System.out.println("o/p: " + firstHalf);
        } else {
            // Return literal null for odd length strings
            System.out.println("o/p: null");
        }
        
        sc.close();
    }
}