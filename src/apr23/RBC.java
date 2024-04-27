package apr23;

public class RBC extends BankOfCanada {
    private double rateOfinterest;

    public RBC(double rateOfinterest) {
        this.rateOfinterest = rateOfinterest;
    }

    public void rateOfInterest() {
        System.out.println("The rate of interest in RBC is " + rateOfinterest);
    }

}
