import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int counter = 1; counter <= 3; counter++) {

            System.out.print("Enter citizen name: ");
            String name = input.next();

            System.out.print("Enter yearly earnings: ");
            double earnings = input.nextDouble();

            double tax;

            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = (30000 * 0.15) + ((earnings - 30000) * 0.20);
            }

            System.out.println("Citizen Name: " + name);
            System.out.println("Total Tax: $" + tax);
            System.out.println("-------------------------");
        }

        input.close();
    }
}

