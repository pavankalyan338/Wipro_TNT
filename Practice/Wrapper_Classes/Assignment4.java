/*
 * Create an employee class with properties of your choice. 
 * Create an object of this class and also create a clone of the same. 
 * After making the clone, change the properties of the original employee object 
 * and print the properties of both the original and clone object and note down your observation.
 */

class Employee implements Cloneable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    // Overriding clone() method of Object class
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Employee [ID: " + empId + ", Name: " + name + ", Salary: " + salary + "]");
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        try {
            // Creating original Employee object
            Employee emp1 = new Employee(101, "Alice", 50000.0);

            // Creating a clone of emp1
            Employee emp2 = (Employee) emp1.clone();

            System.out.println("=== Before Modifying Original Object ===");
            System.out.print("Original : ");
            emp1.display();
            System.out.print("Cloned   : ");
            emp2.display();

            // Modifying properties of the original employee object
            emp1.setName("Alice Smith");
            emp1.setSalary(65000.0);

            System.out.println("\n=== After Modifying Original Object ===");
            System.out.print("Original : ");
            emp1.display();
            System.out.print("Cloned   : ");
            emp2.display();

            System.out.println("\nObservation: Modifying the original object does not affect the cloned object because primitive/string fields are copied by value during cloning.");

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}