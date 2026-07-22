import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * Create an Employee class with three private variables id, name and salary.
 * Create getters & setters and a parameterized constructor.
 * 
 * Create an ArrayList and store 5 to 10 Employee objects in it. 
 * Write a program using Predicate, to filter and display the name of the employees whose salary is less than 10000.
 */

class Employee {
    private int id;
    private String name;
    private double salary;

    // Parameterized Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        // Creating an ArrayList and storing 6 Employee objects
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Rahul", 15000.0));
        employeeList.add(new Employee(102, "Priya", 8500.0));
        employeeList.add(new Employee(103, "Amit", 12000.0));
        employeeList.add(new Employee(104, "Neha", 7200.0));
        employeeList.add(new Employee(105, "Suresh", 9800.0));
        employeeList.add(new Employee(106, "Kiran", 20000.0));

        // Predicate to check if an employee's salary is less than 10000
        Predicate<Employee> lowSalaryPredicate = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        // Filtering and displaying employee names using Predicate
        for (Employee emp : employeeList) {
            if (lowSalaryPredicate.test(emp)) {
                System.out.println(emp.getName() + " (Salary: " + emp.getSalary() + ")");
            }
        }
    }
}