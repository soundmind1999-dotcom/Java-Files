import java.util.Scanner;

public class Lowercase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any word: ");
        String word = input.nextLine();

        String result = "";

        for (int index = 0; index < word.length(); index++) {

            char ch = word.charAt(index);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); 
            }

            result += ch;
        }

        System.out.println("Lowercase: " + result);
    }
}
