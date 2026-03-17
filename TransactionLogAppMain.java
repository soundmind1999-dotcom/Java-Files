
import java.util.Scanner;
import java.util.ArrayList;

public class TransactionLogAppMain{

	public static void main (String [] args){

		ArrayList <String> transactions = new ArrayList <> ();
		double accountBalance = 0.0;

		Scanner input = new Scanner (System.in);

		while (true){
			String Menu = """

				Welcome to Transaction Log App
				1. Deposit
				2. Withdraw
				3. Show Transactions
				4. Exit

			""";

			System.out.println(Menu);
		
			System.out.print("Enter your choice: ");
			int choice = input.nextInt();
			double amount;

			switch(choice){

				case 1:
					System.out.print("Enter deposit amount: ");
					amount = input.nextDouble();
					accountBalance = TransactionLogApplication.deposit(amount, accountBalance, transactions);
					break;

				case 2:
					System.out.print("Enter withdrawal amount: ");
					amount = input.nextDouble();

					if (amount <= accountBalance){
						accountBalance = TransactionLogApplication.withdraw(amount, accountBalance, transactions);
					}

					else{
						System.out.println("Withdrawal failed: insufficient fund");
					}
					break;

				case 3:
					TransactionLogApplication.showTransactions(transactions);
					break;

				case 4:
					System.out.printf("Final Balance: N%.2f%n", accountBalance);
					System.out.println("Thank you for using Transaction Log App");
					break;
			}
		}
	}

}

