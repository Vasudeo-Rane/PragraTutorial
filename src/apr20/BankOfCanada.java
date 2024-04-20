package apr20;

public class BankOfCanada extends Bank {
    int mortgageRate;

    public BankOfCanada(String accountInfo, int accountNumber, Branch branch, int mortgageRate) {
        super(accountInfo, accountNumber, branch);
        this.mortgageRate = mortgageRate;
    }

    public void printMortgage() {
        System.out.println("Mortgage rates is " + this.mortgageRate);
        System.out.println(this.branch.toString());
    }
}
