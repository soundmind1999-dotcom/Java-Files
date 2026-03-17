public class MiniCalculator {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 5;
        int num3 = 2;

        System.out.println("Addition: " + add(num1, num2, num3));
        System.out.println("Subtraction: " + subtract(num1, num2, num3));
        System.out.println("Multiplication: " + multiply(num1, num2, num3));
        System.out.println("Division: " + divide(num1, num2, num3));
    }

    public static int add(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        return total;
    }

    public static int subtract(int num1, int num2, int num3){    
      int minus = num1 - num2 - num3;
        return minus;
    }

    public static int multiply(int num1, int num2, int num3){
        int multiply = num1 * num2 * num3;

        reurn multiply;

   
    }

    public static double divide (double num1, double num2, double num3){
        double divide = num1 / num2 / num3;

        return divide;
    }
}




//public class MiniCalculator {
//
//    public static void main(String[] args) {
//
//        // Two numbers
//        System.out.println("=== Using Two Numbers ===");
//        System.out.println("Addition: " + add(10, 5));
//        System.out.println("Subtraction: " + subtract(10, 5));
//        System.out.println("Multiplication: " + multiply(10, 5));
//        System.out.println("Division: " + divide(10, 5));
//
//        System.out.println();
//
//        // Three numbers
//        System.out.println("=== Using Three Numbers ===");
//        System.out.println("Addition: " + add(20, 5, 2));
//        System.out.println("Subtraction: " + subtract(20, 5, 2));
//        System.out.println("Multiplication: " + multiply(20, 5, 2));
//        System.out.println("Division: " + divide(20, 5, 2));
//    }
//
//    // ====== TWO NUMBERS ======
//
//    public static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static double subtract(double a, double b) {
//        return a - b;
//    }
//
//    public static double multiply(double a, double b) {
//        return a * b;
//    }
//
//    public static double divide(double a, double b) {
//        return a / b;
//    }
//
//    // ====== THREE NUMBERS ======
//
//    public static double add(double a, double b, double c) {
//        return a + b + c;
//    }
//
//    public static double subtract(double a, double b, double c) {
//        return a - b - c;
//    }
//
//    public static double multiply(double a, double b, double c) {
//        return a * b * c;
//    }
//
//    public static double divide(double a, double b, double c) {
//        return a / b / c;
//    }
//}
//
//
//import java.util.Scanner;
//
//public class MiniCalculator {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter operator (+, -, *, /): ");
//        char operator = input.next().charAt(0);
//
//        System.out.print("Do you want to use 2 or 3 numbers? ");
//        int choice = input.nextInt();
//
//        if (choice == 2) {
//
//            System.out.print("Enter first number: ");
//            double a = input.nextDouble();
//
//            System.out.print("Enter second number: ");
//            double b = input.nextDouble();
//
//            if (operator == '+')
//                System.out.println("Result: " + add(a, b));
//            else if (operator == '-')
//                System.out.println("Result: " + subtract(a, b));
//            else if (operator == '*')
//                System.out.println("Result: " + multiply(a, b));
//            else if (operator == '/')
//                System.out.println("Result: " + divide(a, b));
//            else
//                System.out.println("Invalid operator.");
//
//        } else if (choice == 3) {
//
//            System.out.print("Enter first number: ");
//            double a = input.nextDouble();
//
//            System.out.print("Enter second number: ");
//            double b = input.nextDouble();
//
//            System.out.print("Enter third number: ");
//            double c = input.nextDouble();
//
//            if (operator == '+')
//                System.out.println("Result: " + add(a, b, c));
//            else if (operator == '-')
//                System.out.println("Result: " + subtract(a, b, c));
//            else if (operator == '*')
//                System.out.println("Result: " + multiply(a, b, c));
//            else if (operator == '/')
//                System.out.println("Result: " + divide(a, b, c));
//            else
//                System.out.println("Invalid operator.");
//
//        } else {
//            System.out.println("Invalid choice. Please choose 2 or 3.");
//        }
//
//        input.close();
//    }
//
//    // ===== TWO NUMBERS =====
//    public static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static double subtract(double a, double b) {
//        return a - b;
//    }
//
//    public static double multiply(double a, double b) {
//        return a * b;
//    }
//
//    public static double divide(double a, double b) {
//        return a / b;
//    }
//
//    // ===== THREE NUMBERS =====
//    public static double add(double a, double b, double c) {
//        return a + b + c;
//    }
//
//    public static double subtract(double a, double b, double c) {
//        return a - b - c;
//    }
//
//    public static double multiply(double a, double b, double c) {
//        return a * b * c;
//    }
//
//    public static double divide(double a, double b, double c) {
//        return a / b / c;
//    }
//}
//
//
//
//
//import java.util.Scanner;
//
//public class MiniCalculator {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter operator (+, -, *, /): ");
//        char operator = input.next().charAt(0);
//
//        System.out.print("Do you want to use 2 or 3 numbers? ");
//        int choice = input.nextInt();
//
//        if (choice == 2) {
//
//            System.out.print("Enter first number: ");
//            double a = input.nextDouble();
//
//            System.out.print("Enter second number: ");
//            double b = input.nextDouble();
//
//            if (operator == '+')
//                System.out.println("Result: " + add(a, b));
//            else if (operator == '-')
//                System.out.println("Result: " + subtract(a, b));
//            else if (operator == '*')
//                System.out.println("Result: " + multiply(a, b));
//            else if (operator == '/')
//                System.out.println("Result: " + divide(a, b));
//            else
//                System.out.println("Invalid operator.");
//
//        } else if (choice == 3) {
//
//            System.out.print("Enter first number: ");
//            double a = input.nextDouble();
//
//            System.out.print("Enter second number: ");
//            double b = input.nextDouble();
//
//            System.out.print("Enter third number: ");
//            double c = input.nextDouble();
//
//            if (operator == '+')
//                System.out.println("Result: " + add(a, b, c));
//            else if (operator == '-')
//                System.out.println("Result: " + subtract(a, b, c));
//            else if (operator == '*')
//                System.out.println("Result: " + multiply(a, b, c));
//            else if (operator == '/')
//                System.out.println("Result: " + divide(a, b, c));
//            else
//                System.out.println("Invalid operator.");
//
//        } else {
//            System.out.println("Invalid choice. Please choose 2 or 3.");
//        }
//
//        input.close();
//    }
//
//    // ===== TWO NUMBERS =====
//    public static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static double subtract(double a, double b) {
//        return a - b;
//    }
//
//    public static double multiply(double a, double b) {
//        return a * b;
//    }
//
//    public static double divide(double a, double b) {
//        return a / b;
//    }
//
//    // ===== THREE NUMBERS =====
//    public static double add(double a, double b, double c) {
//        return a + b + c;
//    }
//
//    public static double subtract(double a, double b, double c) {
//        return a - b - c;
//    }
//
//    public static double multiply(double a, double b, double c) {
//        return a * b * c;
//    }
//
//    public static double divide(double a, double b, double c) {
//        return a / b / c;
//    }
//}
//
//
