/*
Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.

 lastDigit(7, 17) → true
 lastDigit(6, 17) → false
 lastDigit(3, 113) → true
*/
package Practice.Flow_Control_Statements;

public class Assignment1B {
    
    // Method to check if two non-negative integers have the same last digit
    public static boolean lastDigit(int num1, int num2) {
        return (num1 % 10) == (num2 % 10);
    }

    public static void main(String[] args) {
        // Testing the examples provided in the assignment
        System.out.println("lastDigit(7, 17) -> " + lastDigit(7, 17));
        System.out.println("lastDigit(6, 17) -> " + lastDigit(6, 17));
        System.out.println("lastDigit(3, 113) -> " + lastDigit(3, 113));
    }
}
