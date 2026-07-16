package Practice.Java_Fundamentals.Arrays;

import java.util.Scanner;

/*
 * Given an array of type int, print true if every element is 1 or 4. 
 *
 * only14([1, 4, 1, 4]) → true
 * only14([1, 4, 2, 4]) → false
 * only14([1, 1]) → true
 */

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Handle edge case for 0 or negative size
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }
        
        int[] arr = new int[n];
        boolean only14 = true; // Assume true until proven otherwise
        
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
            // If the element is neither 1 nor 4, the condition fails
            if (arr[i] != 1 && arr[i] != 4) {
                only14 = false;
            }
        }
        
        // Print the final boolean output
        System.out.println("Output: " + only14);
        
        sc.close();
    }
}