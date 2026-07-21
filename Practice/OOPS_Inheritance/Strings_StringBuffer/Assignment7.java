import java.util.Scanner;

/*
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 
 * 
 * If the input is "xHix", then output is "Hi".
 * If the input is "America", then the output is "America".
 */

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        // Handle edge case for null or empty input
        if (str == null || str.isEmpty()) {
            System.out.println("Output: ");
            sc.close();
            return;
        }
        
        int startIndex = 0;
        int endIndex = str.length();
        
        // Check if the first character is 'x'
        if (str.charAt(0) == 'x') {
            startIndex = 1;
        }
        
        // Check if the last character is 'x' (making sure we don't cross indices for a single-char string "x")
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
            endIndex = str.length() - 1;
        } else if (str.length() == 1 && str.charAt(0) == 'x') {
            // Special edge case where the string is just a single "x"
            endIndex = 0;
        }
        
        // Extract the modified substring if bounds are valid
        String result = (startIndex < endIndex) ? str.substring(startIndex, endIndex) : "";
        
        System.out.println("Output: " + result);
        
        sc.close();
    }
}