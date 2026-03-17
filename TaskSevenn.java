import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int evenCount = 0; 

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter score " + counter + ": ");
            int score = input.nextInt();

            if (score % 2 == 0) {
                sum += score;
                evenCount++;
            }
        }

        System.out.println("Sum of only the even scores: " + sum);

        if (evenCount > 0) {
            double average = (double) sum / evenCount; 
            System.out.println("Average of only the even scores: " + average);
        } else {
            System.out.println("No even scores were entered, so average cannot be calculated.");
        }
    }
}

