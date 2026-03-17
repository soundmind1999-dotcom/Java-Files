import java.util.Scanner;

public class JavaTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        int reversed = 0;
        int original = number;

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Using for loop instead of while
        for (; number > 0; number /= 10) {  // number /= 10 removes last digit each iteration
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
        }

        // Restore negative sign if needed
        if (original < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
