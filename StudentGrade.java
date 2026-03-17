import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        ArrayList<Integer> studentsNumberList = new ArrayList<>(); // storing student numbers (or IDs)
        ArrayList<Integer> subjectsList = new ArrayList<>();
        ArrayList<ArrayList<Double>> scoresList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Student Grade System: ");

        // Ask for number of students first
        System.out.print("Enter Number Of Students: ");
        int studentsNumber = input.nextInt();
        input.nextLine(); // consume leftover newline

        // Loop for each student
        for (int studentCounter = 0; studentCounter < studentsNumber; studentCounter++) {

            System.out.print("Enter Number of Students: ");
            int studentNumber = input.nextInt();
            studentsNumberList.add(studentNumber);

            System.out.print("Enter number of subjects offered: ");
            int subjectsOffered = input.nextInt();
            subjectsList.add(subjectsOffered);

            ArrayList<Double> studentsScores = new ArrayList<>();
            for (int subjectCounter = 0; subjectCounter < subjectsOffered; subjectCounter++) {
                double score;
                do {
                    System.out.print("Enter score for subject " + (subjectCounter + 1) + ": ");
                    score = input.nextDouble();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score! Must be between 0 and 100.");
                    }
                } while (score < 0 || score > 100);

                studentsScores.add(score);
            }

            scoresList.add(studentsScores);
            input.nextLine(); // consume leftover newline
        }

        // Print student data
        System.out.println("\nStudent Data:");
        for (int studentCounter = 0; studentCounter < studentsNumber; studentCounter++) {
            System.out.println("Student Number/ID: " + studentsNumberList.get(studentCounter));
            System.out.println("Scores: " + scoresList.get(studentCounter));
        }
    }
}



