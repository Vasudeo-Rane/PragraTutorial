package assignment4;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double Rupees) {
        this.balance = this.balance + Rupees;
    }

    public void withdrawn(double Rupees) {
        this.balance = this.balance - Rupees;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }
}
