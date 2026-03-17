

public class Asterik4 {

    public static void main(String[] args) {

        int number = 10;

        for (int count = 1; count <= number; count++) {

         for (int space = number - count; space > 0; space--) {

            System.out.print(" ");
            }

           for (int counter = count; counter > 0; counter--) {
                System.out.print("*");
            }

            System.out.println();
     }
 }
}

//
//
//public class Asterik4 {
//
//    public static void main(String[] args) {
//
//        int number = 10;
//
//        for (int count = 1; count <= number; count++) {
//
//            // Print spaces
//            for (int space = number - count; space > 0; space--) {
//                System.out.print(" ");
//            }
//
//            // Print stars
//            for (int counter = count; counter > 0; counter--) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
//}
