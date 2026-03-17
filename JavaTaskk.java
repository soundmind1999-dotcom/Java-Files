//import java.util.Scanner;
//
//public class JavaTaskk {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter Number 1: ");
//        int num1 = input.nextInt();
//
//        System.out.println("Enter Number 2: ");
//        int num2 = input.nextInt();
//
//        if (num2 == 0) {
//            System.out.println("Math Error");
//            return;
//        }
//
//        int count = 0;
//
//        for (; num1 >= num2; ) {
//            num1 = num1 - num2;
//            count++;
//        }
//
//        System.out.print(count);
//    }
//}




import java.util.Scanner;

public class JavaTaskk {

   
    public static int divide(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Math Error");
            return;
        }

        int count = 0;

       
        for (; num1 >= num2; ) {
            num1 = num1 - num2;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();

        int result = divide(num1, num2);

        System.out.println("Result: " + result);
    }
}
