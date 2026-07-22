import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*
 * Employee Management System
 * 
 * Create a menu based Java application with the following options:
 * 1. Add an Employee
 * 2. Display All
 * 3. Exit
 * 
 * If option 1 is selected, the application should gather details of the employee like 
 * employee name, employee id, designation (or age as per sample output) and salary, and store it in a file.
 * If option 2 is selected, the application should display all the employee details.
 * If option 3 is selected, the application should exit.
 */

// Employee Class implementing Serializable
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

// Custom ObjectOutputStream to prevent header rewriting when appending objects to an existing file
class AppendingObjectOutputStream extends ObjectOutputStream {
    public AppendingObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // Reset header to avoid stream corruption when appending to an existing file
        reset();
    }
}

public class Project {
    private static final String FILE_NAME = "EmployeeDetails.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        addEmployee(sc);
                        break;
                    case 2:
                        displayAllEmployees();
                        break;
                    case 3:
                        System.out.println("Exiting the System");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid numerical menu option.\n");
            }
        }

        sc.close();
    }

    // Option 1: Add Employee and Append to File
    private static void addEmployee(Scanner sc) {
        try {
            System.out.print("Enter Employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Employee Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            Employee emp = new Employee(id, name, age, salary);

            java.io.File file = new java.io.File(FILE_NAME);
            boolean fileExists = file.exists() && file.length() > 0;

            FileOutputStream fos = new FileOutputStream(file, true);
            ObjectOutputStream oos;

            if (fileExists) {
                oos = new AppendingObjectOutputStream(fos);
            } else {
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(emp);
            oos.close();
            fos.close();

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input. Employee creation aborted.\n");
        } catch (IOException e) {
            System.out.println("Error saving employee details: " + e.getMessage() + "\n");
        }
    }

    // Option 2: Display All Employees from File
    private static void displayAllEmployees() {
        java.io.File file = new java.io.File(FILE_NAME);

        if (!file.exists() || file.length() == 0) {
            System.out.println("---- Report -----");
            System.out.println("No employee records found.");
            System.out.println("---- End of Report -----\n");
            return;
        }

        System.out.println("---- Report -----");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                Employee emp = (Employee) ois.readObject();
                System.out.println(emp);
            }
        } catch (EOFException e) {
            // End of File reached naturally
            System.out.println("---- End of Report -----\n");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading employee records: " + e.getMessage() + "\n");
        }
    }
}