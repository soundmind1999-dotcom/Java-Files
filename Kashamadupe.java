//public class Kashamadupe {
//
//    public static void main(String[] args) {
//
//        String text = "KASHAMADUPE";
//        int length = text.length();
//
//        for (int count = 0; count < length; count--) {
//
//            for (int space = length - count; space <= 1; space++) {
//                System.out.print(" ");
//            }
//
//            for (int counter = count; counter < length; counter++) {
//                System.out.print(text.charAt(counter));
//            }
//
//            System.out.println();
//        }
//    }
//}
//
//





public class Kashamadupe {

    public static void main(String[] args) {

        String text = "KASHAMADUPE";
        int length = text.length();

        for (int count = 0; count <= length; count++) {

         for (int space = 0; space < count; space++) {
                System.out.print(" ");
            }

           for (int counter = count; counter < length; counter++) {
                  System.out.print(text.charAt(counter));
            }

            System.out.println();
     }
 }
}




public class Kashamadupe {

    public static void main(String[] args) {

        String text = "KASHAMADUPE";
        int length = text.length();

        for (int row = 0; row < length; row++) { 

            
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            
            for (int col = row; col < length; col++) {
                System.out.print(text.charAt(col));
            }

        
            System.out.println();
        }
    }
}






