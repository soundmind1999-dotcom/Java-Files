import java.util.ArrayList;
import java.util.Scanner;

public class TransactionLogApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double newBalance = 0;
        ArrayList<String> transactionList = new ArrayList<>();

        while (true) {
            System.out.print("""
                Transaction Log App

                1. Deposit
                2. Withdraw
                3. Show Transactions
                4. Exit

                Enter here:
                """);

            int choice = input.nextInt();

            switch (choice) {

                case 1 ->  {
                    System.out.print("Enter deposit amount: ₦");
                    double amount = input.nextDouble();
                    newBalance += amount;

                    String transaction = String.format("Deposited: ₦%.2f | New Balance: ₦%.2f", amount, newBalance);

                    transactionList.add(transaction);
                    System.out.println(transaction);
                    System.out.println();
                }

                case 2 ->  {
                    System.out.print("Enter withdrawal amount: ₦");
                    double amount = input.nextDouble();
                    newBalance -= amount;

                    String transaction =  String.format("Withdrew: ₦" + amount + " | New Balance: ₦" + newBalance;)

                    transactionList.add(transaction);
                    System.out.println(transaction);
                    System.out.println();
                }

                case 3 ->  {
                    if (transactionList.isEmpty()) {
                        System.out.println("No transactions yet.");
                    } else {
                        for (int index = 0; index < transactionList.size(); index++) {
                            System.out.println((index + 1) + ". " + transactionList.get(index));
                        }
                    }
                    System.out.println();
                }

                case 4 -> {
                    System.out.printf("Final Balance: ₦" + newBalance);
                    input.close();
                    return;
                }

                default -> 
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
