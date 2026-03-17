import java.util.Scanner;

public class JavaTask14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        if (number < 0) {
            number = -number;
        }

        while (number > 0) {
            int digit = number % 10; // get last digit

            if (digit % 2 == 0) {    
                sum += digit;
            }

            number = number / 10;    // remove last digit
        }

        System.out.println("Sum of even digits: " + sum);
    }
}
