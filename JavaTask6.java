import java.util.Scanner;

public class JavaTask6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("Character\tASCII Value");

        for (int index = 0; index < text.length(); index++) {
            char ch = text.charAt(index);
            int ascii = (int) ch; 
            System.out.println(ch + "\t\t" + ascii);
        }
    }
}
