package Practice.Java_Fundamentals.Arrays;

import java.util.Scanner;

/*
 * Write a program to print the sum of the elements of an array following the given below condition.
 *
 * If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
 *
 * Eg1) Array Elements - 10,3,6,1,2,7,9
 * O/P: 22   
 * [i.e 10+3+9]
 *
 * Eg2) Array Elements - 7,1,2,3,6
 * O/P:19
 *
 * Eg3) Array Elements - 1,6,4,7,9
 * O/P:10
 */

public class Assignment8 {
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
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            // If we encounter a 6, look ahead to see if there's a 7
            if (arr[i] == 6) {
                int indexOf7 = -1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 7) {
                        indexOf7 = j;
                        break;
                    }
                }
                
                // If a 7 was found after this 6, skip all numbers up to and including the 7
                if (indexOf7 != -1) {
                    i = indexOf7; 
                } else {
                    // If no 7 is found after the 6, just add the 6 normally
                    sum += arr[i];
                }
            } else {
                // For all other normal numbers, add them to the sum
                sum += arr[i];
            }
        }
        
        System.out.println("O/P: " + sum);
        
        sc.close();
    }
}
