public class ATM {

    private Account account;

    // Session state
    private boolean loggedIn;

    // PIN attempts
    private int pinAttempts;
    private final int MAX_ATTEMPTS = 3;

    // Constructor
    public ATM(Account account) {
        this.account = account;
        loggedIn = false;
        pinAttempts = 0;
    }

    // PIN verification
    public boolean verifyPin(String enteredPin) {

        if (pinAttempts >= MAX_ATTEMPTS) {
            System.out.println("Account is locked.");
            return false;
        }

        if (enteredPin.equals(account.getPin())) {

            loggedIn = true;
            pinAttempts = 0;

            System.out.println("\nPIN verified successfully.");
            System.out.println("Login successful.");

            return true;
        }

        pinAttempts++;

        System.out.println("Incorrect PIN.");

        if (pinAttempts < MAX_ATTEMPTS) {
            System.out.println(
                "Attempts remaining: " +
                (MAX_ATTEMPTS - pinAttempts)
            );
        } else {
            System.out.println("Account locked.");
        }

        return false;
    }

    // Check balance
    public void checkBalance() {

        if (!loggedIn) {
            System.out.println("Please login first.");
            return;
        }

        System.out.println(
            "\nCurrent Balance: Rs." + account.getBalance()
        );
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (!loggedIn) {
            System.out.println("Please login first.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }

        account.withdraw(amount);

        System.out.println(
            "\nRs." + amount + " withdrawn successfully."
        );

        System.out.println(
            "Remaining Balance: Rs." + account.getBalance()
        );
    }

    // Deposit money
    public void deposit(double amount) {

        if (!loggedIn) {
            System.out.println("Please login first.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        account.deposit(amount);

        System.out.println(
            "\nRs." + amount + " deposited successfully."
        );

        System.out.println(
            "Updated Balance: Rs." + account.getBalance()
        );
    }

    // Logout
    public void logout() {

        loggedIn = false;

        System.out.println("\nYou have been logged out.");
        System.out.println("Thank you for using the ATM.");
    }

    // Check session state
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Check PIN attempts
    public int getPinAttempts() {
        return pinAttempts;
    }

    public int getMaxAttempts() {
        return MAX_ATTEMPTS;
    }
}