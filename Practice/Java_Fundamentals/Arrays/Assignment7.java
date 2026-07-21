import java.util.Scanner;

/*
 * Write a program to remove the duplicate elements in an array and print the same.
 * * Example)
 * I/P:{12,34,12,45,67,89}
 * O/P:{12,34,45,67,89}
 */

public class Assignment7 {
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
        
        // Temporary array to store unique elements
        int[] temp = new int[n];
        int uniqueCount = 0; // Tracks the number of unique elements
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            // Check if the current element is already in our temp array
            for (int k = 0; k < uniqueCount; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If it's not a duplicate, add it to temp and increment our count
            if (!isDuplicate) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        // Print the final array in the requested format
        System.out.print("O/P:{");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(temp[i]);
            // Add a comma if it's not the last element
            if (i < uniqueCount - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
        
        sc.close();
    }
}