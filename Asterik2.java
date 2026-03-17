public class Asterik2 {
    public static void main(String[] args) {
        int number = 10;
        for (int count = 10; count >= 1; count--) {

            for (int counter = 1; counter <= count; counter++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
