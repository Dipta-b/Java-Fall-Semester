public class BankAccount {

    // i. Instance variables
    int accountNumber;
    String accountHolderName;
    double balance;

    // ii. Constructor to initialize the account
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // iii. Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // add money to balance
            System.out.println("Deposited: $" + amount);
            displayBalance();
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // iv. Method to withdraw money if sufficient balance
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount; // subtract money from balance
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance! Cannot withdraw $" + amount);
            }
            displayBalance();
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // v. Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
        System.out.println("--------------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount(101, "Alice", 500);

        // Deposit money
        account.deposit(200);

        // Withdraw money
        account.withdraw(100);

        // Attempt to withdraw more than balance
        account.withdraw(700);
    }
}
