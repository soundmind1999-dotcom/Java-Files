import java.util.Scanner;

public class HighestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect three scores
        System.out.print("Enter the first score: ");
        int score1 = scanner.nextInt();

        System.out.print("Enter the second score: ");
        int score2 = scanner.nextInt();

        System.out.print("Enter the third score: ");
        int score3 = scanner.nextInt();

        int highest, secondHighest;

        // Determine highest and second highest
        if (score1 >= score2 && score1 >= score3) {
            highest = score1;
            secondHighest = Math.max(score2, score3);
        } else if (score2 >= score1 && score2 >= score3) {
            highest = score2;
            secondHighest = Math.max(score1, score3);
        } else {
            highest = score3;
            secondHighest = Math.max(score1, score2);
        }

        // Print results
        System.out.println("Highest score: " + highest);
        System.out.println("Second highest score: " + secondHighest);

        scanner.close();
    }
}

