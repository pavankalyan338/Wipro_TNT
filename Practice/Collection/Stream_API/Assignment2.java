import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Create an Employee class with
 * 1. Instance variables: empNo, name, age, location.
 * 2. A parameterized constructor to initialize them.
 * 
 * Write a program
 * 1. To add five Employee objects into an ArrayList ,
 * 2. Filter the Employee objects whose location is Pune,
 * 3. Store them in a separate ArrayList and print their details.
 */

class Employee {
    private int empNo;
    private String name;
    private int age;
    private String location;

    // Parameterized constructor
    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // toString method to print employee details
    @Override
    public String toString() {
        return "Employee [EmpNo=" + empNo + ", Name=" + name + ", Age=" + age + ", Location=" + location + "]";
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        // 1. Adding five Employee objects into an ArrayList
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Rahul", 25, "Pune"));
        employeeList.add(new Employee(102, "Priya", 28, "Bangalore"));
        employeeList.add(new Employee(103, "Amit", 30, "Pune"));
        employeeList.add(new Employee(104, "Neha", 24, "Mumbai"));
        employeeList.add(new Employee(105, "Suresh", 27, "Pune"));

        // 2. Filter the Employee objects whose location is "Pune"
        // 3. Store them in a separate ArrayList
        ArrayList<Employee> puneEmployees = employeeList.stream()
                .filter(emp -> "Pune".equalsIgnoreCase(emp.getLocation()))
                .collect(Collectors.toCollection(ArrayList::new));

        // Printing details of filtered employees
        System.out.println("--- Employees Located in Pune ---");
        puneEmployees.forEach(System.out::println);
    }
}