package apr20;

public class Scotia extends BankOfCanada {

    private int minimumDeposit;
    private int fees;

    public Scotia(String accountInfo, int accountNumber, Branch branch, int mortgageRate, int minimumDeposit, int fees) {
        super(accountInfo, accountNumber, branch, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    void printScotiaBankInfo() {
        System.out.println("accountInfo is " + this.accountInfo);
        System.out.println("accountNumber number is " + this.accountNumber);
        System.out.println("mortgageRate number is " + this.mortgageRate);
        System.out.println("minimumDeposit is " + this.minimumDeposit);
        System.out.println("Fees for the bank is " + this.fees);
    }
}
