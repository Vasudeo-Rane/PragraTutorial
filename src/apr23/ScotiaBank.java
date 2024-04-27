package apr23;

public class ScotiaBank extends BankOfCanada {
    private double rateOfinterest;

    public ScotiaBank(double rateOfinterest) {
        this.rateOfinterest = rateOfinterest;
    }

    public void rateOfInterest() {
        System.out.println("The rate of interest in ScotiaBank is  " + rateOfinterest);
    }

}
