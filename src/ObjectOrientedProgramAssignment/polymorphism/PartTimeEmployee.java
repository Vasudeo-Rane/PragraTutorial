package ObjectOrientedProgramAssignment.polymorphism;

public class PartTimeEmployee extends Employee {


    private int hrWorked;
    private String name;

    private static final double hourlyRate = 8.50;

    public int gethrWorked() {
        return hrWorked;
    }

    public void sethrWorked(int hrWorked) {
        this.hrWorked = hrWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PartTimeEmployee(int hrWorked, String name) {
        this.hrWorked = hrWorked;
        this.name = name;
    }

    public void calculatePay() {
        System.out.println("The Salary for the part time employee is " + hourlyRate * hrWorked);

    }


}
