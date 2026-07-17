// Employee class (Derived Class inheriting from Person)
class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String insuranceNumber;

    // Parameterized Constructor initializing parent and child variables
    public Employee(String name, double annualSalary, int startYear, String insuranceNumber) {
        super(name); // Invoking parent constructor
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.insuranceNumber = insuranceNumber;
    }

    // Getters and Setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}