package banking_transaction_system;

public class CheckingAccount extends Account {
	    private static final double OVERDRAFT_LIMIT = 100; // Allow overdraft up to $100

	    public CheckingAccount(double initialBalance) {
	        super(initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited to Checking Account: " + amount);
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance + OVERDRAFT_LIMIT >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn from Checking Account: " + amount);
	        } else {
	            System.out.println("Overdraft limit reached in Checking Account.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
}
