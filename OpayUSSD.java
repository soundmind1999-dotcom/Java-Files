import java.util.Scanner;

public class OpayUSSD {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to OPay");
        System.out.println("Dial *955#");
        System.out.println();

        System.out.println("OPay Menu");
        System.out.println("1. Transfer Money");
        System.out.println("2. Buy Airtime");
        System.out.println("3. Pay Bills");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");

        System.out.print("Select an option: ");
        int option = input.nextInt();

        switch (option) {

            case 1:
                System.out.println("Transfer Money");
                System.out.println("1. To OPay User");
                System.out.println("2. To Bank");

                System.out.print("Choose option: ");
                int transferOption = input.nextInt();

                switch (transferOption) {
                    case 1:
                        System.out.print("Enter OPay Account Number: ");
                        String opayAccount = input.next();
                        System.out.print("Enter Amount: ");
                        int amount1 = input.nextInt();
                        System.out.println("Transfer of ₦" + amount1 + " to OPay user successful.");
                        break;

                    case 2:
                        System.out.print("Enter Bank Account Number: ");
                        String bankAccount = input.next();
                        System.out.print("Enter Amount: ");
                        int amount2 = input.nextInt();
                        System.out.println("Transfer of ₦" + amount2 + " to bank successful.");
                        break;

                    default:
                        System.out.println("Invalid transfer option.");
                }
                break;

            case 2:
                System.out.println("Buy Airtime");
                System.out.println("1. Self");
                System.out.println("2. Others");

                System.out.print("Choose option: ");
                int airtimeOption = input.nextInt();

                switch (airtimeOption) {
                    case 1:
                        System.out.print("Enter Amount: ");
                        int airtimeSelf = input.nextInt();
                        System.out.println("₦" + airtimeSelf + " airtime purchased successfully.");
                        break;

                    case 2:
                        System.out.print("Enter Phone Number: ");
                        String phone = input.next();
                        System.out.print("Enter Amount: ");
                        int airtimeOther = input.nextInt();
                        System.out.println("₦" + airtimeOther + " airtime sent to " + phone);
                        break;

                    default:
                        System.out.println("Invalid airtime option.");
                }
                break;

            case 3:
                System.out.println("Pay Bills");
                System.out.println("1. Electricity");
                System.out.println("2. Cable TV");

                System.out.print("Choose option: ");
                int billOption = input.nextInt();

                switch (billOption) {
                    case 1:
                        System.out.print("Enter Meter Number: ");
                        String meter = input.next();
                        System.out.print("Enter Amount: ");
                        int elecAmount = input.nextInt();
                        System.out.println("Electricity bill of ₦" + elecAmount + " paid successfully.");
                        break;

                    case 2:
                        System.out.print("Enter Decoder Number: ");
                        String decoder = input.next();
                        System.out.print("Enter Amount: ");
                        int cableAmount = input.nextInt();
                        System.out.println("Cable TV payment of ₦" + cableAmount + " successful.");
                        break;

                    default:
                        System.out.println("Invalid bill option.");
                }
                break;

            case 4:
                System.out.println("Your account balance is ₦50,000");
                break;

            case 5:
                System.out.println("Thank you for using OPay.");
                break;

            default:
                System.out.println("Invalid option. Try again.");
        }

        input.close();
    }
}


