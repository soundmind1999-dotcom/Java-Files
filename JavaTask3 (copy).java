import java.util.Scanner;

public class JavaTask3{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int uppercaseCount = 0;

        for (int index = 0; index < text.length(); index++) {
            char ch = text.charAt(index);

      
            if (ch >= 'A' && ch <= 'Z') {
                uppercaseCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + uppercaseCount);
    }
}
