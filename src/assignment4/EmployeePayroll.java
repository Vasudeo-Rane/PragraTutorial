package assignment4;

public class EmployeePayroll {
    private int employeeId;
    private String employeeName;
    private double basicSalary;

    private String designation;

    EmployeePayroll(int employeeId, String employeeName, double basicSalary, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.designation = designation;

    }

    double grossSalary = 0;

    public double calculateGrossSalary(double hourlyRate, double hoursWorked) {
        grossSalary = hourlyRate * hoursWorked;
        return grossSalary;
    }

    double deductions = 0;

    public double calculateDeduction(double taxRate) {
        deductions = grossSalary * (taxRate / 100);
        return deductions;
    }

    public double calculateNetSalary() {
        return grossSalary - deductions;
    }


}

