package Collections;

public class Bank<T, R, Q> {
    T typeOfAccount;
    R customerId;
    Q balance;

    public Bank(T typeOfAccount, R customerId, Q balance) {
        this.typeOfAccount = typeOfAccount;
        this.customerId = customerId;
        this.balance = balance;
    }

    public Bank(T typeOfAccount, R customerId) {
        this.typeOfAccount = typeOfAccount;
        this.customerId = customerId;

    }

    @Override
    public String toString() {
        return "Bank{" +
                "typeOfAccount=" + typeOfAccount +
                ", customerId=" + customerId +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Bank<String, Integer, Double> bank = new Bank<String, Integer, Double>("Saving", 1234, 0.00);
        Bank<String, Integer, Double> bank1 = new Bank<String, Integer, Double>("Saving", 1234);

        System.out.println(bank);
        System.out.println(bank1);

    }
}
