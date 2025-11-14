public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added.");
    }
}
