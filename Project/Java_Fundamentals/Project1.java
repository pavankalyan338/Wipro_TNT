/*
 * Project 1: Employee Information - Input & Display
 * Develop a small java application which accepts employee id from the command prompt
 * and displays the employee details along with their calculated salary.
 */

public class Project1 {
    public static void main(String[] args) {
        // Check if an employee ID was passed as a command-line argument
        if (args.length == 0) {
            System.out.println("Please provide an employee ID as a command line argument.");
            return;
        }

        String searchId = args[0];
        boolean isFound = false;

        // Initialize a 2D array with the given employee details
        // Columns mapping: {EmpNo, EmpName, JoinDate, DesigCode, Department, Basic, HRA, IT}
        String[][] employees = {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        // Loop through the array to find the matching employee ID
        for (int i = 0; i < employees.length; i++) {
            if (employees[i][0].equals(searchId)) {
                isFound = true;

                // Extract relevant details
                String empNo = employees[i][0];
                String empName = employees[i][1];
                String desigCode = employees[i][3];
                String department = employees[i][4];

                // Parse the financial details to integers for calculation
                int basic = Integer.parseInt(employees[i][5]);
                int hra = Integer.parseInt(employees[i][6]);
                int it = Integer.parseInt(employees[i][7]);

                String designation = "";
                int da = 0;

                // Determine Designation and DA using switch-case on the Designation Code
                switch (desigCode) {
                    case "e":
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case "c":
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case "k":
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case "r":
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case "m":
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        designation = "Unknown";
                        da = 0;
                }

                // Calculate total salary: (Basic + HRA + DA - IT)
                int salary = basic + hra + da - it;

                // Print the headers and details formatted cleanly
                System.out.printf("%-10s %-12s %-15s %-15s %s\n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
                System.out.printf("%-10s %-12s %-15s %-15s %d\n", empNo, empName, department, designation, salary);

                // Exit the loop since we found the target employee
                break; 
            }
        }

        // Output error message if the ID wasn't in the database
        if (!isFound) {
            System.out.println("There is no employee with empid : " + searchId);
        }
    }
}
