public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount("SA001", "Alice", 5000, 0.05);
        CheckingAccount ca = new CheckingAccount("CA001", "Bob", 2000, 500);

        bank.addAccount(sa);
        bank.addAccount(ca);

        sa.deposit(1000);
        sa.withdraw(2000);
        sa.addInterest();

        ca.withdraw(2300);
        ca.deposit(500);

        bank.displayAllAccounts();
    }
}
