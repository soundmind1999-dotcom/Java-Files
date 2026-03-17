import java.util.Scanner;

public class MiniCal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter (+,/,-,*): ");
        String operator = input.nextLine();
  
        System.out.print("Do you want to use 2 or 3 numbers? ");
        int choice = input.nextInt();

        if (choice == 2) {

            System.out.print("Enter first number: ");
            double firstNum = input.nextDouble();

            System.out.print("Enter second number: ");
            double secondNum = input.nextDouble();

            if (operator.equals("+"))
                System.out.println("Result: " + add(firstNum, secondNum));
            else if (operator.equals("-"))
                System.out.println("Result: " + subtract(firstNum, secondNum));
            else if (operator.equals("*"))
                System.out.println("Result: " + multiply(firstNum, secondNum));
            else if (operator.equals("/"))
                System.out.println("Result: " + divide(firstNum, secondNum));
            else
                System.out.println("Invalid operator.");

        } else if (choice == 3) {

            System.out.print("Enter first number: ");
            double firstNum = input.nextDouble();

            System.out.print("Enter second number: ");
            double secondNum = input.nextDouble();

            System.out.print("Enter third number: ");
            double thirdNum = input.nextDouble();

            if (operator.equals("+"))
                System.out.println("Result: " + add(firstNum, secondNum, thirdNum));
            else if (operator.equals("-"))
                System.out.println("Result: " + subtract(firstNum, secondNum, thirdNum));
            else if (operator.equals("*"))
                System.out.println("Result: " + multiply(firstNum, secondNum, thirdNum));
            else if (operator.equals("/"))
                System.out.println("Result: " + divide(firstNum, secondNum, thirdNum));
            else
                System.out.println("Invalid operator");

        } else {
            System.out.println("Invalid choice. Choose 2 or 3");
        }

    }

   
    public static double add(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public static double subtract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public static double multiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public static double divide(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

    
    public static double add(double firstNum, double secondNum, double thirdNum) {
        return firstNum + secondNum + thirdNum;
    }

    public static double subtract(double firstNum, double secondNum, double thirdNum) {
        return firstNum - secondNum - thirdNum;
    }

    public static double multiply(double firstNum, double secondNum, double thirdNum) {
        return firstNum * secondNum * thirdNum;
    }

    public static double divide(double firstNum, double secondNum, double thirdNum) {
        return firstNum / secondNum / thirdNum;
    }
}






























































