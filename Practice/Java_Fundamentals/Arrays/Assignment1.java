

/*
 * Write a program to initialize an integer array and print the sum and average of the array.
 * (Dynamic Input Version)
 */
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        int sum = 0;
        
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        
        double average = (double) sum / n;
        
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
        
        sc.close();
    }
}
