import java.util.Scanner;
public class TaskTwo2{

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int numberCopy = number;

        int count = 0;
        while (numberCopy != 0){
            numberCopy /= 10;
            count++;
        }

        numberCopy = number;

        int [] numberDigits = new int [count];
        int index = 0;
        int digitSquareSum = 0;
        while(numberCopy != 0){
            numberDigits[index] = numberCopy%10;
            digitSquareSum += (numberDigits[index] * numberDigits[index]);
            numberCopy /= 10;
            index++;
        }

        System.out.printf("The sum of the square of each digit is %d%n", digitSquareSum);

        int sumOfFactorials = 0;

        for (int counter = 0; counter < numberDigits.length; counter++){
            int numberFactorial = 1;
            for (int val = 1; val <= numberDigits[0]; val++){
                numberFactorial *= val;
            }
            sumOfFactorials += numberFactorial;
        }

        System.out.printf("The sum of factorial of each number is %d%n", sumOfFactorials);

        int [] clonedNumberDigits = numberDigits.clone();

        for (int counter = 0; counter < clonedNumberDigits.length; counter++){
            int largest = clonedNumberDigits[counter];
            for (int value = counter; value < clonedNumberDigits.length; value++){
                if (clonedNumberDigits[value] > clonedNumberDigits[counter]){
                    largest = clonedNumberDigits[value];
                    clonedNumberDigits[value] = clonedNumberDigits[counter];
                    clonedNumberDigits[counter] = largest;
                }
            }
        }

        int length = clonedNumberDigits.length;

        if (length % 2 == 0){
            System.out.printf("The median number is %.2f%n", (clonedNumberDigits[(length/2) -1] + clonedNumberDigits[length/2])/2.0);
        }

        else{
            System.out.printf("The median number is %d%n", clonedNumberDigits[length/2]);
        }

        int sum = 0;

        for (int digits : clonedNumberDigits){
            sum += digits;
        }

        System.out.printf("The mean of the digits is %.2f%n", (double)sum/length);

        
        
    }

}
