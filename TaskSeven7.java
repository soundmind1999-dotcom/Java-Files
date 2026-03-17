import java.util.Scanner;
import java.util.Random;

public class TaskSeven7 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        
        int maxAttempts = 10;

        int[] attempts = new int[maxAttempts]; // array to store guesses
        

        System.out.println("Guess the random number between 1 and 20:");
        int randomNumber = input.nextInt();
        int number = 1 + rand.nextInt(20); // random number
        int numOfAttempts = 0;

        while (numOfAttempts < maxAttempts) {

            randomNumber = input.nextInt();
            attempts[numOfAttempts] = randomNumber; // store guess
            numOfAttempts++;

            if (randomNumber == number) {
                System.out.println("You won!");
                System.out.println("You guessed correctly in " + numOfAttempts + " attempts.");
                break;
            } else {
                System.out.println("You are wrong. Guess again");
            }
        }

        if (numOfAttempts == maxAttempts && attempts[numOfAttempts - 1] != number) {
            System.out.println("Game Over");
            System.out.println("Correct number: " + number);
        }

        // Print all attempts
        System.out.println("\nAttempts entered by the user:");
        for (int count = 0; count < numOfAttempts; count++) {
            System.out.println("Attempt " + (count + 1) + ": " + attempts[count]);
        }
    }
}

