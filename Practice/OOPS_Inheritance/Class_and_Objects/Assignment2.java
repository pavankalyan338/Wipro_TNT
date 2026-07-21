import java.util.Scanner;

/*
 * Create a new class called Calculator with the following methods: 
 * 1. A static method called powerInt(int num1,int num2)
 * This method should return num1 to the power num2.
 * 2. A static method called powerDouble(double num1,int num2).
 * This method should return num1 to the power num2.
 * 3. Invoke both the methods and test the functionalities.
 * Hint: Use Math.pow(double,double) to calculate the power.
 */

// Define the Calculator class as specified in the assignment
class Calculator {
    // Static method for integer power calculation
    public static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Static method for double power calculation
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Test powerInt(int, int) ---");
        System.out.print("Enter integer base (num1): ");
        int intBase = sc.nextInt();
        System.out.print("Enter integer exponent (num2): ");
        int intExp = sc.nextInt();
        
        // Invoking the static method powerInt
        double intResult = Calculator.powerInt(intBase, intExp);
        System.out.println("Result of powerInt: " + (int) intResult);

        System.out.println("\n--- Test powerDouble(double, int) ---");
        System.out.print("Enter double base (num1): ");
        double doubleBase = sc.nextDouble();
        System.out.print("Enter integer exponent (num2): ");
        int doubleExp = sc.nextInt();

        // Invoking the static method powerDouble
        double doubleResult = Calculator.powerDouble(doubleBase, doubleExp);
        System.out.println("Result of powerDouble: " + doubleResult);

        sc.close();
    }
}