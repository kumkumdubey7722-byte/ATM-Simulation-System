import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating an account
        Account account = new Account(
            "123456",
            "1234",
            10000
        );

        // Creating ATM object
        ATM atm = new ATM(account);

        System.out.println("================================");
        System.out.println("        WELCOME TO ATM");
        System.out.println("================================");

        // PIN verification
        while (!atm.isLoggedIn()) {

            System.out.print("\nEnter your PIN: ");

            String pin = scanner.nextLine();

            if (atm.verifyPin(pin)) {
                break;
            }

            // Stop after 3 wrong attempts
            if (atm.getPinAttempts() >= atm.getMaxAttempts()) {

                System.out.println("\nSession terminated.");

                scanner.close();
                return;
            }
        }

        // ATM session
        while (atm.isLoggedIn()) {

            System.out.println("\n================================");
            System.out.println("           ATM MENU");
            System.out.println("================================");

            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Logout");

            System.out.println("================================");

            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":

                    atm.checkBalance();

                    break;

                case "2":

                    System.out.print(
                        "Enter withdrawal amount: "
                    );

                    try {

                        double amount =
                            Double.parseDouble(scanner.nextLine());

                        atm.withdraw(amount);

                    } catch (NumberFormatException e) {

                        System.out.println(
                            "Please enter a valid amount."
                        );
                    }

                    break;

                case "3":

                    System.out.print(
                        "Enter deposit amount: "
                    );

                    try {

                        double amount =
                            Double.parseDouble(scanner.nextLine());

                        atm.deposit(amount);

                    } catch (NumberFormatException e) {

                        System.out.println(
                            "Please enter a valid amount."
                        );
                    }

                    break;

                case "4":

                    atm.logout();

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }
        }

        scanner.close();
    }
}