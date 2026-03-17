//import java.util.Scanner;
//
//public class MultiplyBasic {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        int number1 = input.nextInt();
//        System.out.print("Enter second number: ");
//        int number2 = input.nextInt();
//
//        int result = 0;
//
//        for (int count = 1; count <= number2; count++) {
//            result += number1;
//        }
//
//        System.out.println("Product: " + result);
//    }
//}




import java.util.Scanner;
public class MultiplyBasic{

    public static void main (String[]args){
    
    int factorial = 1;
    Scanner input = new Scanner (System.in);

    System.out.print("Enter any number: ");
    int number = input.nextInt();


    for (int count = 2; count <= number; count++){
        int total = 0;
        for (int counter=1; counter <= count; counter ++){
        total += factorial;
    
        

}
        factorial = total;
}


        System.out.print(factorial);
}

}

