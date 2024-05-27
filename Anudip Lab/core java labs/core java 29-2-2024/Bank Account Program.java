//Implement a bank account class showing method overloading with methods for deposit, withdrawal and balance inquiry.Use method overloading to handle different types of withdrawals (e.g., with or without fees).
import java.util.Scanner;

class BankAccount 
{
    int accountNumber;
    double balance;

    // Constructor to initialize account number and balance
    public BankAccount(int accountNumber) 
	{
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Method to deposit amount into the account
    void transaction(int accountNumber, double amount) 
	{
        this.balance = amount;
        System.out.println("Deposit of " + amount + " successful" );
    }

    // Method to withdraw amount from the account
    void transaction(double amount) 
	{
        this.balance = amount;
        System.out.println("withdraw of " + amount + " successful");
    }

    // Method to check balance
    void transaction() 
	{
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: " + this.balance);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Get account number from user
        System.out.print("Enter account number: ");
		
        int accountNumber = sc.nextInt();
		
        BankAccount account = new BankAccount(accountNumber);

        // Get amount from user for deposit
        System.out.print("Enter amount: ");
		
        double amount = sc.nextDouble();

        // Perform deposit
        account.transaction(accountNumber, amount);

        // Get amount from user for withdrawal
        System.out.print("Enter amount for withdrawal: ");
		
        amount = sc.nextDouble();

        // Perform withdrawal
        account.transaction(amount);

        // Check balance
        account.transaction();

        sc.close();
    }
}

