package ObjectOrientedProgramAssignment.polymorphism;

public class MainEmployee {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(40, "Rohan");

        fullTimeEmployee.calculatePay();

        Employee partTimeEmployee = new PartTimeEmployee(20, "Ankit");

        partTimeEmployee.calculatePay();


    }

}
