package Practice.OOPS_Inheritance.Strings_StringBuffer;

import java.util.Scanner;

/*
 * Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
 * 
 * The strings will not be the same length, but they may be empty (length 0).
 * 
 * If input is "hi" and "hello", then output will be "hihellohi".
 */

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string (a): ");
        String a = sc.nextLine();
        
        System.out.print("Enter the second string (b): ");
        String b = sc.nextLine();
        
        String result;
        
        // Compare lengths to determine which string goes on the outside
        if (a.length() < b.length()) {
            result = a + b + a;
        } else {
            result = b + a + b;
        }
        
        // Print the combined output string
        System.out.println("Output: " + result);
        
        sc.close();
    }
}