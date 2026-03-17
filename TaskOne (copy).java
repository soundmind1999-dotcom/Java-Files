
import java.util.Scanner;
public class TaskOne{

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        int [] numberArray = new int [10]; 

        for (int counter = 0; counter <= 9; counter++){

            System.out.printf("Enter number %d: ", counter + 1);
            numberArray[counter] = input.nextInt();     
        }

        int evenSum = 0;
        int oddSum = 0;
        int evenSquare = 0;
        int oddSquare = 0;

        System.out.print("\nThe even numbers are: ");
        for (int value : numberArray){
            if (value % 2 == 0){
                System.out.print(value + " ");
                evenSum += value;
            }
        }
        
        System.out.print("\nThe odd numbers are: ");
        for (int value : numberArray){
            if (value % 2 != 0){
                System.out.print(value + " ");
                oddSum += value;
            }
        }
       
        System.out.printf("\nThe sum of all even numbers is %d%n", evenSum);
        System.out.printf("The sum of all odd numbers is %d%n", oddSum);
        System.out.printf("The sum of all numbers is %d%n", oddSum + evenSum);

        System.out.print("\nThe square of each even numbers are: ");
        for (int value : numberArray){
            if (value % 2 == 0){
                System.out.print((value * value) + " ");
                evenSquare += (value * value);
            }
        }
        
        System.out.print("\nThe square of each odd numbers are: ");
        for (int value : numberArray){
            if (value % 2 != 0){
                System.out.print((value * value) + " ");
                oddSquare += (value * value);
            }
        }
        
        System.out.printf("\nThe mean of the numbers is %.2f%n", (double) (evenSum + oddSum)/10);
        System.out.printf("\nThe sum of the even numbers squared is %d%n", evenSquare);
        System.out.printf("\nThe sum of the odd numbers squared is %d%n", oddSquare);
        System.out.printf("\nThe sum of the square of all numbers is %d%n", evenSquare + oddSquare);

    }
}
