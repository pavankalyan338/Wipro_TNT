import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Write a program that will have a Vector which is capable of storing Employee objects. 
 * Use an Iterator and enumeration to list all the elements of the Vector.
 */

class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        // Create a Vector capable of storing Employee objects
        Vector<Employee> empVector = new Vector<>();

        // Add Employee objects to the Vector
        empVector.add(new Employee(101, "John", 50000.0));
        empVector.add(new Employee(102, "Alice", 60000.0));
        empVector.add(new Employee(103, "Bob", 55000.0));

        // 1. Traverse and display elements using Iterator
        System.out.println("--- Listing Elements Using Iterator ---");
        Iterator<Employee> iterator = empVector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        // 2. Traverse and display elements using Enumeration
        System.out.println("--- Listing Elements Using Enumeration ---");
        Enumeration<Employee> enumeration = empVector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}