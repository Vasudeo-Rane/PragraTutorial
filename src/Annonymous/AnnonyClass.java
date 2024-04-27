package Annonymous;

public class AnnonyClass {
    public static void main(String[] args) {
        Bank bank = new Bank() {
            @Override
            void calculateInterest() {
                System.out.println("Calculate the interest");
            }
        };

        bank.calculateInterest();
    }
}
