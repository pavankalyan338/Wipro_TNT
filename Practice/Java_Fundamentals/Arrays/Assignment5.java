package Practice.Java_Fundamentals.Arrays;

import java.util.Scanner;
import java.util.Arrays;

/*
 * Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
 */

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array (minimum 2): ");
        int n = sc.nextInt();
        
        // Handle edge case where the array has less than 2 elements
        if (n < 2) {
            System.out.println("Error: The array must have at least 2 elements to find the top and bottom 2.");
            sc.close();
            return;
        }
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Since it's sorted, the first two elements are the smallest
        System.out.println("Smallest two numbers are: " + numbers[0] + " and " + numbers[1]);
        
        // The last two elements are the largest
        System.out.println("Largest two numbers are: " + numbers[n - 1] + " and " + numbers[n - 2]);
        
        sc.close();
    }
}