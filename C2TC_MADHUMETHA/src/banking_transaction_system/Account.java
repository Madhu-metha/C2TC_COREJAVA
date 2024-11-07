package banking_transaction_system;

public abstract class Account {
	    protected double balance;

	    // Abstract methods
	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    // Constructor to initialize balance and increment account count
	    public Account(double initialBalance) {
	        this.balance = initialBalance;
	        Bank.incrementTotalAccounts();
	    }
}
