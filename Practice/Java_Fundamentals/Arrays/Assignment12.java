import java.util.Scanner;

/*
 * Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.
 *
 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[3];
        int[] b = new int[3];
        
        // Populate the first array
        System.out.println("Enter 3 elements for the first array (a):");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        
        // Populate the second array
        System.out.println("Enter 3 elements for the second array (b):");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        
        // Create a new array of length 2 to hold the middle elements
        int[] result = new int[2];
        
        // Index 1 is the middle element of an array of length 3
        result[0] = a[1];
        result[1] = b[1];
        
        // Print the final output in the requested format
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        
        sc.close();
    }
}