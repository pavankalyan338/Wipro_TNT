package Practice.Java_Fundamentals.Arrays;

/*
 * Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.
 *
 * Example1:
 * C:\>java Sample 1 2 3
 * O/P: Please enter 9 integer numbers
 *
 * Example2:
 * C:\>java Sample 1 23 45 55 121 222 56 77 89
 * O/P: 
 * The given array is :
 * 1 23 45 
 * 55 121 222 
 * 56 77 89 
 * The biggest number in the given array is 222
 */

public class Assignment14 {
    public static void main(String[] args) {
        // Check if exactly 9 arguments are passed
        if (args.length < 9) {
            System.out.println("Please enter 9 integer numbers");
        } else {
            try {
                // Initialize a 3x3 array
                int[][] arr = new int[3][3];
                int k = 0;
                
                // Initialize max with the lowest possible integer value
                int max = Integer.MIN_VALUE;
                
                // Parse the command line arguments into the 2D array and find the maximum
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        arr[i][j] = Integer.parseInt(args[k]);
                        
                        // Check if current element is greater than current max
                        if (arr[i][j] > max) {
                            max = arr[i][j];
                        }
                        
                        k++;
                    }
                }
                
                // Print the original array
                System.out.println("The given array is :");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                
                // Print the biggest number found
                System.out.println("The biggest number in the given array is " + max);
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide valid integer numbers.");
            }
        }
    }
}