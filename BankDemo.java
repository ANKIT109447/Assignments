// User-defined exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor to initialize account balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this withdrawal! Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
        System.out.println("New Balance: " + balance);
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Main class to simulate the bank transaction
public class BankDemo {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(5000.0);

        try {
            // Deposit some money
            account.deposit(2000.0);

            // Attempt to withdraw an amount that exceeds the balance
            account.withdraw(8000.0);
        } catch (InsufficientFundsException e) {
            // Handle the user-defined exception
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // Display the remaining balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
