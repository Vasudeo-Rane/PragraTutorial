package apr20;

public class BankMain extends RBC {

    public BankMain(String accountInfo, int accountNumber, Branch branch, int mortgageRate, int minimumDeposit, int fees) {
        super(accountInfo, accountNumber, branch, mortgageRate, minimumDeposit, fees);
    }

    public static void main(String[] args) {
//        Branch branch = new Branch("230 Milterton Drive", 1234);
//        RBC rbc = new RBC("Saving", 1234, branch, 1, 2000, 5);
        RBC rbc = new RBC("Saving", 1234, new Branch("230 Milterton Drive", 1234), 1, 2000, 5);
        rbc.printRBCBankInfo();
        rbc.printMortgage();

        Branch branch1 = new Branch("4205 Shipp Drive", 9876);
        Scotia scotia = new Scotia("Checking ", 8828, branch1, 2, 5000, 2);
        scotia.printScotiaBankInfo();
        scotia.printMortgage();


    }
}
