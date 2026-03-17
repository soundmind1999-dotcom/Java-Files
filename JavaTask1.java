import java.util.Scanner;

public class JavaTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String reversed = "";

        
        for (int count = text.length() - 1; count >= 0; count--) {
            reversed += text.charAt(count);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
