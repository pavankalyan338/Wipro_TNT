import java.util.Scanner;

/*
 * Create an interface Test with an abstract method "int myFunction".
 * This function takes three integer parameters.
 * 
 * Write a program to create two Test reference variables t1 and t2.
 * t1 should add three integer parameters and t2 should multiply three integer parameters, using lambda expression.
 * 
 * Call myFunction using t1 and t2 reference variables, by passing three integer values and print the result.
 */

@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lambda expression to add three integers
        Test t1 = (a, b, c) -> a + b + c;

        // Lambda expression to multiply three integers
        Test t2 = (a, b, c) -> a * b * c;

        System.out.print("Enter three integer values (separated by space): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Calling myFunction using t1 and t2 reference variables
        int additionResult = t1.myFunction(num1, num2, num3);
        int multiplicationResult = t2.myFunction(num1, num2, num3);

        System.out.println("Addition Result (t1): " + additionResult);
        System.out.println("Multiplication Result (t2): " + multiplicationResult);

        sc.close();
    }
}