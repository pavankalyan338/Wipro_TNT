import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
 * Given an ArrayList with 5 Employee(id,name,location,salary) objects, 
 * write a program to extract the location details of each Employee 
 * and store it in an ArrayList, with the help of Function.
 */

class Employee {
    private int id;
    private String name;
    private String location;
    private double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        // Creating an ArrayList with 5 Employee objects
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Rahul", "Hyderabad", 50000));
        employeeList.add(new Employee(102, "Priya", "Bangalore", 65000));
        employeeList.add(new Employee(103, "Amit", "Pune", 55000));
        employeeList.add(new Employee(104, "Neha", "Chennai", 70000));
        employeeList.add(new Employee(105, "Suresh", "Delhi", 48000));

        // Function interface to extract location from Employee
        Function<Employee, String> getLocationFunction = Employee::getLocation;

        // Extracting locations into a new ArrayList using the Function interface
        ArrayList<String> locationList = new ArrayList<>();
        for (Employee emp : employeeList) {
            locationList.add(getLocationFunction.apply(emp));
        }

        // Displaying extracted locations
        System.out.println("Extracted Employee Locations:");
        locationList.forEach(System.out::println);
    }
}