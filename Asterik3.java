public class Asterik3 {
    public static void main(String[] args) {

        int rows = 10; // Number of rows

        // Outer loop: controls each row
        for (int row = 0; row < rows; row++) {

            // Print leading spaces
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 0; col < rows - row; col++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
