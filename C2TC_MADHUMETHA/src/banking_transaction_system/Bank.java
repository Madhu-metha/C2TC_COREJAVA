package banking_transaction_system;

public class Bank {
	    // Static variable to keep track of the total accounts
	    private static int totalAccounts = 0;

	    // Static method to increment total accounts
	    public static void incrementTotalAccounts() {
	        totalAccounts++;
	    }

	    // Static method to get total accounts
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }
}