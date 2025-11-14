public abstract class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String getDetails() {
        return "Account: " + accountNumber + ", Owner: " + ownerName +
                ", Balance: " + balance;
    }
}
