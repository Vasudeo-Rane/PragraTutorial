package apr23;

public class MainBank {
    public static void main(String[] args) {
        BankOfCanada scotiaBank = new ScotiaBank(4.5);
        scotiaBank.rateOfInterest();

        BankOfCanada rbc = new RBC(5.5);
        rbc.rateOfInterest();
    }
}
