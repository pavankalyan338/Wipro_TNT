import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 1) Create an application for employee management with the following classes:
 * 
 * a) Create an Employee class with following attributes and behaviors :
 *    i) int empId
 *    ii) String empName
 *    iii) String email
 *    iv) String gender 
 *    v) float salary
 *    vi) void GetEmployeeDetails() -> prints employee details
 * 
 * b) Create one more class EmployeeDB with the following attributes and behaviors.
 *    i) ArrayList list;
 *    ii) boolean addEmployee(Employee e) -> adds the employee object to the collection
 *    iii) boolean deleteEmployee(int empId) -> delete the employee object from the collection with the given empid
 *    iv) String showPaySlip(int empId) -> returns the payslip of the employee with the given empId
 * 
 * Provide implementation for all the methods and test your program.
 */

class Employee {
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public float getSalary() {
        return salary;
    }

    public void GetEmployeeDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Email         : " + email);
        System.out.println("Gender        : " + gender);
        System.out.println("Salary        : " + salary);
        System.out.println("------------------------------------");
    }
}

class EmployeeDB {
    private List<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getEmpId() == empId) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee emp : list) {
            if (emp.getEmpId() == empId) {
                return "Payslip for Employee ID " + empId + " (" + emp.getEmpName() + "): $ " + emp.getSalary();
            }
        }
        return "Employee with ID " + empId + " not found.";
    }

    public void printAllEmployees() {
        for (Employee emp : list) {
            emp.GetEmployeeDetails();
        }
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        Employee emp1 = new Employee(101, "John Doe", "john@example.com", "Male", 55000.0f);
        Employee emp2 = new Employee(102, "Jane Smith", "jane@example.com", "Female", 65000.0f);
        Employee emp3 = new Employee(103, "Alex Johnson", "alex@example.com", "Male", 48000.0f);

        // Adding employees
        db.addEmployee(emp1);
        db.addEmployee(emp2);
        db.addEmployee(emp3);

        System.out.println("--- All Employee Details ---");
        db.printAllEmployees();

        // Showing Payslip
        System.out.println("--- PaySlip Details ---");
        System.out.println(db.showPaySlip(102));
        System.out.println();

        // Deleting Employee
        System.out.println("--- Deleting Employee ID 101 ---");
        boolean isDeleted = db.deleteEmployee(101);
        System.out.println("Deleted successfully: " + isDeleted + "\n");

        System.out.println("--- Remaining Employee Details ---");
        db.printAllEmployees();
    }
}