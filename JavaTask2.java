import java.util.Scanner;

public class JavaTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        int reversed = 0;
        int original = number; // keep a copy for display

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        while (number > 0) {
            int lastDigit = number % 10; // get last digit
            reversed = reversed * 10 + lastDigit; // append it
            number = number / 10; // remove last digit
        }

        // Restore negative sign if original was negative
        if (original < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
