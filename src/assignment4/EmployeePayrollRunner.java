package assignment4;

public class EmployeePayrollRunner {
    public static void main(String[] args) {
        EmployeePayroll Emp1 = new EmployeePayroll(1, "Vasu", 100, "VP");
        Emp1.calculateGrossSalary(60, 160);
        Emp1.calculateDeduction(30);
        Emp1.calculateNetSalary();
        System.out.println(Emp1.calculateNetSalary());
    }
}