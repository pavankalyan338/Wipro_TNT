import java.util.Scanner;

/*
 * Create a class called Person with a member variable name. Save it in a file called Person.java
 * 
 * Create a class called Employee that will inherit the Person class.The other data members of the Employee class 
 * are annual salary (double), the year the employee started to work, and the national insurance number which is a String.
 * Save this in a file called Employee.java
 * 
 * Your class should have the necessary constructors and getter/setter methods.
 * 
 * Write another class called TestEmployee, containing a main method to fully test your class definition.
 */

// Person class (Base Class)

// Public class acting as the test driver program
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Enter Employee Details ===");
        
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Annual Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Start Year: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consume newline leftover

        System.out.print("Enter National Insurance Number: ");
        String insuranceNo = sc.nextLine();

        // Instantiate Employee object dynamically
        Employee emp = new Employee(name, salary, year, insuranceNo);

        // Display retrieved records using getter methods
        System.out.println("\n=================================");
        System.out.println("        EMPLOYEE PROFILE         ");
        System.out.println("=================================");
        System.out.println("Name             : " + emp.getName());
        System.out.println("Annual Salary    : $" + emp.getAnnualSalary());
        System.out.println("Work Start Year  : " + emp.getStartYear());
        System.out.println("Insurance Number : " + emp.getInsuranceNumber());
        System.out.println("=================================");

        sc.close();
    }
}