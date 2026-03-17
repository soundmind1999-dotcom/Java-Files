import java.util.Scanner;

public class Collect {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = input.nextInt();

        if (number >= 1000) {
            
      
        System.out.printf("%,d%n", number);

        } else {
            
            System.out.println("$" + number);
        }

  
    
}


}

