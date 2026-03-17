import java.util.Scanner;

public class JavaTask8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Divisors of " + number + " are:");

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) { 
                System.out.print(count + " ");
            }
        }
    }
}
