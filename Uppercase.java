import java.util.Scanner;

public class Uppercase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any word: ");
        String word = input.nextLine();

        String result = "";

        for (int index = 0; index < word.length(); index++) {

            char ch = word.charAt(index);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); 
            }

            result += ch;
        }

        System.out.println("Uppercase: " + result);
    }
}
