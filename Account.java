public class Account {

    private String accountNumber;
    private String pin;
    private double balance;

    // Constructor
    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Get PIN
    public String getPin() {
        return pin;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public boolean deposit(double amount) {

        if (amount <= 0) {
            return false;
        }

        balance = balance + amount;
        return true;
    }

    // Withdraw money
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            return false;
        }

        if (amount > balance) {
            return false;
        }

        balance = balance - amount;
        return true;
    }
}