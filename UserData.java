import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;

        while (counter <= 10) {

            System.out.print("Enter name " + counter + ": " );
            String name = input.nextLine();

            System.out.print("Enter age " + counter + ": ");
            int age = input.nextInt();
     

            System.out.println("Name: " + name, age);
          
        }
    }
}

