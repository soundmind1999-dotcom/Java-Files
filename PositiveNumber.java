import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int steps = 0;

        System.out.println("Steps:");

        while (number != 1) {

            if (number % 2 == 0) {  
                number = number / 2;
            } else {                 
                number = (number / 3) + 1;
            }

            steps++;
            System.out.println("Step " + steps + ": " + number);
        }

        System.out.println("Total steps taken: " + steps);

    }
}
