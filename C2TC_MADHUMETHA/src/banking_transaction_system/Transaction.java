package banking_transaction_system;

public final class Transaction {
	    // Final variable for transaction fee
	    private final double transactionFee = 1.50;

	    // Final method to perform transaction, ensuring consistency
	    public final void performTransaction(Account account, String transactionType, double amount) {
	        if (transactionType.equalsIgnoreCase("deposit")) {
	            account.deposit(amount - transactionFee);
	            System.out.println("Transaction fee applied: " + transactionFee);
	        } else if (transactionType.equalsIgnoreCase("withdraw")) {
	            account.withdraw(amount + transactionFee);
	            System.out.println("Transaction fee applied: " + transactionFee);
	        } else {
	            System.out.println("Invalid transaction type.");
	        }
	    }
}
