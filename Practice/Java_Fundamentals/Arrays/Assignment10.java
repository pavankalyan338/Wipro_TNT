package Practice.Java_Fundamentals.Arrays;

import java.util.Scanner;

/*
 * Print an array that contains the exact same numbers as the given array, 
 * but rearranged so that all the even numbers come before all the odd numbers. 
 * Other than that, the numbers can be in any order. 
 * You may modify and print the given array, or make a new array.
 *
 * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
 * evenOdd([3, 3, 2]) → [2, 3, 3]
 * evenOdd([2, 2, 2]) → [2, 2, 2]
 */

public class Assignment10 {
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
        
        // Create a new array to store the rearranged elements
        int[] result = new int[n];
        
        // Pointers for placing evens at the front and odds at the back
        int leftIndex = 0;
        int rightIndex = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                // If the number is even, place it at the left side
                result[leftIndex] = arr[i];
                leftIndex++;
            } else {
                // If the number is odd, place it at the right side
                result[rightIndex] = arr[i];
                rightIndex--;
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