package apr20;

public class Bank {
    String accountInfo;
    int accountNumber;

    Branch branch;

    public Bank(String accountInfo, int accountNumber, Branch branch) {
        this.accountInfo = accountInfo;
        this.accountNumber = accountNumber;
        this.branch = branch;
    }

}

