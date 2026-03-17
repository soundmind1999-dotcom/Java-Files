import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] scores = new int[10]; // array to hold 10 scores

        for (int counter = 0; counter < scores.length; counter++) {
            System.out.println("Enter score " + (counter + 1) + ": ");
            scores[counter] = input.nextInt();
         
        }

    }
}

