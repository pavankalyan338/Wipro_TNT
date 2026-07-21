import java.util.Scanner;
import java.util.Arrays;

/*
 * Write a program to initialize an array and print them in a sorted order.
 */

public class Assignment6 {
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
        
        // Sort the array in ascending order automatically
        Arrays.sort(numbers);
        
        // Print the sorted elements
        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        // Add a new line at the end for cleaner terminal output
        System.out.println();
        
        sc.close();
    }
}