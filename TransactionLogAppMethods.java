
import java.util.ArrayList;

public class TransactionLogApp{
 public static double deposit(double amount, double accountBalance, ArrayList <String> transactions){ accountBalance += amount;

		String transaction = String.format("Deposit: %.2f | New Balance: %.2f", amount, accountBalance);

		System.out.println(transaction);

		transactions.add(transaction);

		return accountBalance;

	}

	public static double withdraw(double amount, double accountBalance, ArrayList <String> transactions){	

		accountBalance -= amount;

		String transaction = String.format("Withdrawal: %.2f | New Balance: %.2f", amount, accountBalance);

		System.out.println(transaction);

		transactions.add(transaction);

		return accountBalance;

	}

	public static void showTransactions(ArrayList <String> transactions){

        if (transactionList.isEmpty()) {
            System.out.println("No transactions yet.");}
        else {
            for (int index = 0; index < transactionList.size(); index++) {
                System.out.println((index + 1) + ". " + transactionList.get(index));
			} 

		}

		else
			System.out.println("No transaction yet.");

	}

}

