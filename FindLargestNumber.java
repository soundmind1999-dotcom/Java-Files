import java.util.Scanner;

public class FindLargestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;

        System.out.print("Enter number 1: ");
        int number = input.nextInt();
        int largest = number;

        while (counter < 10) {
            System.out.print("Enter number " + (counter + 1) + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);

        input.close();
    }
}

