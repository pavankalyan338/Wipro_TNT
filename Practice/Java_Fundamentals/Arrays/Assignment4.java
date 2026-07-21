import java.util.Scanner;

/*
 * Initialize an integer array with ascii values and print the corresponding character values in a single row.
 */

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of ASCII values you want to process: ");
        int n = sc.nextInt();
        
        int[] asciiValues = new int[n];
        
        System.out.println("Enter the " + n + " ASCII values (e.g., 65 for 'A', 97 for 'a'):");
        for (int i = 0; i < n; i++) {
            asciiValues[i] = sc.nextInt();
        }
        
        System.out.print("The corresponding characters are: ");
        for (int i = 0; i < n; i++) {
            // Cast the integer to a char to print the ASCII equivalent
            System.out.print((char) asciiValues[i] + " ");
        }
        
        System.out.println();
        sc.close();
    }
}