

public class Loops1 {

    public static void main(String[] args) {

        int number = 5;

        for (int count = 1; count <= number; count++) {

         for (int space = number - count; space > 0; space--) {
                System.out.print(" ");
            }

           for (int counter = count; counter > 0; counter--) {
                System.out.print(counter);
            }

            System.out.println();
     }
 }
}
