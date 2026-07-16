package Practice.Java_Fundamentals.Arrays;

import java.util.Scanner;

/*
 * Print a version of the given array where all the 10's have been removed. 
 * The remaining elements should shift left towards the start of the array as needed, 
 * and the empty spaces at the end of the array should be 0. 
 * So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
 * You may modify and display the given array or make a new array.
 *
 * withoutTen([1, 10, 10, 2]) -> [1, 2, 0, 0]
 * withoutTen([10, 2, 10]) -> [2, 0, 0]
 * withoutTen([1, 99, 10]) -> [1, 99, 0]
 */

public class Assignment9 {
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
        
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Create a new array to store the result
        // Note: In Java, integer arrays are automatically initialized with 0s!
        int[] result = new int[n];
        int insertIndex = 0; // Tracks where to put the next non-10 number
        
        for (int i = 0; i < n; i++) {
            // If the number is NOT 10, add it to our result array and move our insert index forward
            if (arr[i] != 10) {
                result[insertIndex] = arr[i];
                insertIndex++;
            }
        }
        
        // Print the final output in the requested format
        System.out.print("Output: [");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            // Add a comma if it's not the last element
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        sc.close();
    }
}