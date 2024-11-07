package banking_transaction_system;

public class SavingsAccount extends Account {
	    private static final double INTEREST_RATE = 0.03; // Interest rate of 3%

	    public SavingsAccount(double initialBalance) {
	        super(initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount + (amount * INTEREST_RATE); // Apply interest on deposit
	            System.out.println("Deposited to Savings Account with interest: " + amount);
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn from Savings Account: " + amount);
	        } else {
	            System.out.println("Insufficient balance in Savings Account.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
}
