import java.util.Scanner;
// Bank Account Class
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}
// ATM Machine Class
class ATM {
    private BankAccount bankAccount;
    public ATM(BankAccount account) {
        this.bankAccount = account;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            bankAccount.deposit(amount);
            System.out.println("Deposit successful. New balance: $" + bankAccount.getBalance());
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= bankAccount.getBalance()) {
            bankAccount.withdraw(amount);
            System.out.println("Withdrawal successful. New balance: $" + bankAccount.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }
    public void checkBalance() {
        System.out.println("Current balance: $" + bankAccount.getBalance());
    }
}
// Main class for user interface
public class ATMInterface {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.0);
        ATM atm = new ATM(bankAccount);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. HAKUNAA MATATAA!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}