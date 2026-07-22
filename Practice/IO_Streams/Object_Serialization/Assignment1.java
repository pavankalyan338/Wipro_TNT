import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/*
 * Create a class called Employee with properties name(String), dateOfBirth(java.util.Date), department(String), designation(String) and Salary(double).
 * 
 * Create respective getter and setter methods and constructors (no-argument constructor and parameterized constructor) for the same.
 * 
 * Create an object of the Employee class and save this object in a file called "data" using serialization.
 * Later using deserialization read this object and print the properties of this object.
 */

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
               "Name: " + name + "\n" +
               "Date of Birth: " + dateOfBirth + "\n" +
               "Department: " + department + "\n" +
               "Designation: " + designation + "\n" +
               "Salary: " + salary;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        String fileName = "data";

        // Creating an Employee object
        Employee emp = new Employee("John Doe", new Date(), "IT", "Software Engineer", 75000.0);

        // Serialization: Saving the object into a file called "data"
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized successfully into file '" + fileName + "'.\n");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialization: Reading the object from the file "data"
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Deserialized Employee Object:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}