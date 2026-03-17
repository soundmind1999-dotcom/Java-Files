import java.util.Scanner;

public class UserData{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String names = new String[10];
        int ages = new int[10];

        int counter = 0;

     
        while (counter < 10) {
            System.out.print("Enter name " + (counter + 1) + ": ");
            names[counter] = input.nextLine();

            System.out.print("Enter age " + (counter + 1) + ": ");
            ages[counter] = input.nextInt();
            input.nextLine();  
            counter++;
        }

     
        System.out.println("");
        counter = 0; 

        while (counter < 10) {
            System.out.println((counter + 1) + ". Name: " + names[counter] + " | Age: " + ages[counter]);
            counter++;
        }

        input.close();
    }
}

