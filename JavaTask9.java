import java.util.Scanner;

public class JavaTask9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;

        for (int counter = 1; counter <= number; counter++) {
            if (number % counter == 0) {
                count++;
            }
        }

        System.out.println("Number of divisors of " + number + " is: " + count);
    }
}
