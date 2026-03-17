import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int vowelCount = 0;

        text = text.toLowerCase();

        for (int index = 0; index < text.length(); index++) {

            char ch = text.charAt(index);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
