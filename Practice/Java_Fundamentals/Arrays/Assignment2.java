

import java.util.Scanner;

/*
 * Write a program to initialize an integer array and find the maximum and minimum value of the array.
 */

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Handle edge case where user enters 0 or a negative number
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return; 
        }
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Assume the first element is both the max and min initially
        int max = numbers[0];
        int min = numbers[0];
        
        // Loop through the rest of the array to find true max and min
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);
        
        sc.close();
    }
}