import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userId = "user1";
        String pin = "1234";
        double balance = 1000 ;

        System.out.print("Enter User ID: ");
        String inputUserId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String inputPin = scanner.nextLine();

        if (!userId.equals(inputUserId) || !pin.equals(inputPin)) {
            System.out.println("Invalid user credentials. Exiting...");
            return;
        }

        displayMenu(balance);

        boolean exit = false;
        while (!exit) {
            int choice = scanner.nextInt();

            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    showTransactionHistory(balance); 
                    break;
                case 2:
                    withdraw(balance);
                    break;
                case 3:
                    deposit(balance);
                    break;
                case 4:
                    transfer(balance); 
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu(double balance) {
        System.out.println("\nATM Menu:");
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer"); 
        System.out.println("5. Quit");
        System.out.println("\nCurrent Balance: $" + balance);
    }

    private static void showTransactionHistory(double balance) {
        
        System.out.println("Transaction History: No transactions available.");
    }

    private static void withdraw(double balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Please try again.");
            return;
        }

        balance -= amount;
        System.out.println("Successfully withdrawn " + amount + ".");
        System.out.println("Current balance: " + balance);
    }

    private static void deposit(double balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Successfully deposited " + amount + ".");
        System.out.println("Current balance: " + balance);
    }

    private static void transfer(double balance) {
        
        System.out.println("Transfer functionality not available yet.");
    }
}