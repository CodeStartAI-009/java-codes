class InvalidBalanceException extends Exception {
    InvalidBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    void withdraw(int balance) throws InvalidBalanceException {
        if (balance < 1000) {
            throw new InvalidBalanceException("Balance too low to withdraw");
        }
        System.out.println("Withdraw Successful");
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(500);
        } catch (InvalidBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
