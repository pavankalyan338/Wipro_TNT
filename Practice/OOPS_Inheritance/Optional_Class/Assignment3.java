package Practice.OOPS_Inheritance.Optional_Class;

import java.util.Optional;
import java.util.Scanner;

/*
 * Given an Employee object which may be initialized to null, use Optional class to check if it is null and to throw an user defined exception InvalidEmployeeException.
 */

// User-defined exception as required by the assignment
class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

// Simple Employee class wrapper
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select input option:");
        System.out.println("1. Initialize valid Employee");
        System.out.println("2. Initialize Employee as null");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline leftover

        Employee emp = null;

        if (choice == 1) {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            emp = new Employee(name);
        }

        // Wrap the employee object in an Optional container
        Optional<Employee> empOptional = Optional.ofNullable(emp);

        try {
            // Use orElseThrow to throw the custom exception if the value is null
            Employee validEmp = empOptional.orElseThrow(() -> 
                new InvalidEmployeeException("InvalidEmployeeException: Employee data cannot be null!")
            );
            
            System.out.println("Output: Employee verified successfully. Welcome, " + validEmp.getName() + "!");
        } catch (InvalidEmployeeException e) {
            System.out.println("Output caught exception: " + e.getMessage());
        }

        sc.close();
    }
}