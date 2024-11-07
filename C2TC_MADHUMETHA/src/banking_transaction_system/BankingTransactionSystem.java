package banking_transaction_system;

public class BankingTransactionSystem {
	    public static void main(String[] args) {
	        // Creating accounts
	        Account savingsAccount = new SavingsAccount(500);
	        Account checkingAccount = new CheckingAccount(1000);

	        // Creating transaction handler
	        Transaction transaction = new Transaction();

	        // Performing transactions
	        transaction.performTransaction(savingsAccount, "deposit", 100);
	        transaction.performTransaction(savingsAccount, "withdraw", 50);

	        transaction.performTransaction(checkingAccount, "deposit", 200);
	        transaction.performTransaction(checkingAccount, "withdraw", 150);

	        // Display balances
	        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
	        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());

	        // Display total accounts created
	        System.out.println("Total Bank Accounts Created: " + Bank.getTotalAccounts());
	    }
}
