package assignment4;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount Atharv = new BankAccount(101, "Atharv", 500.00, "Saving ");
        Atharv.deposit(15);
        Atharv.withdrawn(5);
        //       Atharv.getAccountHolderName();
        System.out.println("Account holder name - " + Atharv.getAccountHolderName());
        System.out.println("Account holder account number - " + Atharv.getAccountNumber());
        System.out.println("Account Type - " + Atharv.getAccountType());
        System.out.println("Balance - " + Atharv.getBalance());

    }
}
