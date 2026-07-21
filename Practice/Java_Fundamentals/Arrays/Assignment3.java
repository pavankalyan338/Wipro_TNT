

import java.util.Scanner;

/*
 * Write a program to initialize an integer array with values and check if a given number is present in the array or not.
 *
 * If the number is not found, it will print -1 else it will print the index value of the given number in the array.
 *
 * Example 1) If the Array elements are {1,4,34,56,7} and the search element is 90, then the output expected is -1.
 * Example 2) If the Array elements are {1,4,34,56,7} and the search element is 56, then the output expected is 3.
 */

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.print("Enter the search element: ");
        int searchElement = sc.nextInt();
        
        int index = -1; // Default to -1 (not found)
        
        // Search for the element
        for (int i = 0; i < n; i++) {
            if (numbers[i] == searchElement) {
                index = i; // Save the index where it was found
                break; // Stop searching once we find the first occurrence
            }
        }
        
        System.out.println("Output: " + index);
        
        sc.close();
    }
}