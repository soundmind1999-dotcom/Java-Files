import java.util.Scanner;

    public class ReverseNumber{

        public static void main (String args []){



            Scanner input = new Scanner(System.in);
       

            System.out.print("Enter an integer: ");

            int number = input.nextInt();

            while (number !=0){

            int digit = number % 10;

            number = number / 10;
            System.out.print(digit);

}
            System.out.println();

            
                
            

    }

}   




























































//
//import java.util.Scanner;
//
//public class ReverseUsingWhileLoop {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int count = 1;
//
//        while (count <= 3) {
//            System.out.print("Enter integer " + count);
//            int number = input.nextInt();
//
//      
//            int reversed = 0;
//
//            while (number > 0) {
//                int digit = number % 10;     
//                reversed = reversed * 10 + digit; // build reversed number
//                number = number / 10;         // remove last digit
//            }
//
//            System.out.println("Reversed: " + reversed);
//            count++;
//        }
//    }
//}
//
//}
//
//
//
//
//}
//






