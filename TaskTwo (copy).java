import java.util.Scanner;
import java.util.ArrayList;
public class TaskTwo{

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        ArrayList <Integer> numberDigits = new ArrayList <Integer>();

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        int copyOfNumber = number;

        int sumOfDigits = 0;
        while (copyOfNumber != 0){
            System.out.print(copyOfNumber%10 + " ");
            sumOfDigits += (copyOfNumber%10);
            numberDigits.add(copyOfNumber%10);
            copyOfNumber /= 10;           
        }

        System.out.printf("\nThe sum of the digits is %d%n", sumOfDigits);

        int sumOfFactorials = 0;

        for (int value : numberDigits){
            int numberFactorial = 1;
            for (int count = 1; count <= value; count++){
                numberFactorial *= count;
            }
            sumOfFactorials += numberFactorial;
        }

        System.out.printf("The sum of the factorial of each digit is %d%n", sumOfFactorials);

        ArrayList <Integer> clonedNumberDigit = numberDigit.clone();

        for (int count = 0; count < clonedNumberDigit.size()){
            int largest = clonedNumberDigit.get(count);

            if (clonedNumberDigit.get(count + 1) > largest){
                clonedNumberDigit.get(count + 1) = largest;
                clonedNumber
            }

        }

    }
}
