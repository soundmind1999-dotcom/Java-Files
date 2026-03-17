import java.util.Scanner;

public class JavaTask5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        text = text.toLowerCase(); // Convert to lowercase to simplify comparison
        int position = -1;          // Default if no vowel is found

        for (int index = 0; index < text.length(); index++) {
            char ch = text.charAt(index);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                position = index; // Store the index of first vowel
                break;        // Stop the loop after finding the first vowel
            }
        }

        if (position != -1) {
            System.out.println("The first vowel is at position: " + position);
        } else {
            System.out.println("No vowels found in the string.");
        }
    }
}
