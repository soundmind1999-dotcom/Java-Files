import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Ask for number of subjects
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = input.nextInt();

        // Create 2D array to store scores
        int[][] scores = new int[numberOfStudents][numberOfSubjects];

        // Collect scores
        for (int student = 0; student < numberOfStudents; student++) {
            System.out.println("\nEntering scores for Student " + (student + 1));

            for (int subject = 0; subject < numberOfSubjects; subject++) {

                int score;

                // Validate score input
                do {
                    System.out.print("Enter score for Subject " + (subject + 1) + ": ");
                    score = input.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score! Score must be between 0 and 100.");
                    }

                } while (score < 0 || score > 100);

                scores[student][subject] = score;
            }
        }

    for (int subjectCounter = 0; subjectCounter < numberOfSubjects; subjectCounter++) {
    int highestScore = scores[0][subjectCounter];
    int lowestScore = scores[0][subjectCounter];
    int highestStudent = 0;
    int lowestStudent = 0;  
    int total = 0;
    int pass = 0;
    int fail = 0;

    for (int studentCounter = 0; studentCounter < numberOfStudents; studentCounter++) {
        int score = scores[studentCounter][subjectCounter]; // correct indexing
        total += score;

        if (score >= 40) {
            pass++;
        } else {
            fail++;
        }

        if (score > highestScore) {
            highestScore = score;
            highestStudent = studentCounter;
        }

        if (score < lowestScore) {
            lowestScore = score;
            lowestStudent = studentCounter;
        }
    }

    double average = (double) total / numberOfStudents; // move here, after inner loop

    
    System.out.println("Subject " + (subjectCounter + 1));
    System.out.println("Highest scoring student is Student " + (highestStudent + 1) + ": scoring " + highestScore);
    System.out.println("Lowest scoring student is Student " + (lowestStudent + 1) + ": scoring " + lowestScore);
    System.out.println("Total Score is: " + total);
    System.out.printf("Average Score is: %.2f\n", average);
    System.out.println("Number of passes: " + pass);
    System.out.println("Number of fails: " + fail);
}
//
//        // Display all scores
//        
//         // Print table header
//    System.out.print("STUDENT\t");
//    for (int subject = 0; subject < numberOfSubjects; subject++) {
//    System.out.print("SUB" + (subject + 1) + "\t");
//}
//    System.out.println(); // move to next line
//
// Print each student's scores
//    for (int student = 0; student < numberOfStudents; student++) {
//    System.out.print("Student " + (student + 1) + "\t"); // student column
//
//    for (int subject = 0; subject < numberOfSubjects; subject++) {
//        System.out.print(scores[student][subject] + "\t"); // scores
//    }
//
//    System.out.println(); // move to next line after each student
}


        }
    }


