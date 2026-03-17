import java.util.Scanner;
import java.util.Random;

public class TaskSix6 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int number = 1 + rand.nextInt(20); 
        int randomNumber;
        int numOfAttempts = 0;
        int maxAttempts = 20;

        System.out.println("Guess the random number between 1 and 20:");

        while (numOfAttempts < maxAttempts) {

            randomNumber = input.nextInt();
            numOfAttempts++;

            if (randomNumber == number) {
                System.out.println("You won!");
                System.out.println("You guessed correctly in " + numOfAttempts + " attempts.");
                return;

            } else {
                System.out.println("You are wrong. Guess again");
            }
        }

        
        System.out.println("Game Over");
        System.out.println("Correct number: " + number);
        System.out.println("Number of Attempts used: " + numOfAttempts);
    }
}




































































