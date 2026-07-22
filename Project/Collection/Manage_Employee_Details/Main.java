import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobileNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    // Sort employees naturally by First Name
    @Override
    public int compareTo(Employee other) {
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of Employees");
        int numberOfEmployees = Integer.parseInt(scanner.nextLine().trim());

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = scanner.nextLine().trim();

            System.out.println("Enter the Lastname");
            String lastName = scanner.nextLine().trim();

            System.out.println("Enter the Mobile");
            String mobile = scanner.nextLine().trim();

            System.out.println("Enter the Email");
            String email = scanner.nextLine().trim();

            System.out.println("Enter the Address");
            String address = scanner.nextLine().trim();

            employeeList.add(new Employee(firstName, lastName, mobile, email, address));
        }

        // Sort the collection by First Name
        Collections.sort(employeeList);

        // Display Header using the required format specifier
        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "FirstName", "SecondName", "MobileNumber", "Email", "Address");

        // Display Employee Details
        for (Employee emp : employeeList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                    emp.getFirstName(),
                    emp.getLastName(),
                    emp.getMobileNumber(),
                    emp.getEmail(),
                    emp.getAddress());
        }

        scanner.close();
    }
}