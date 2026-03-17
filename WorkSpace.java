//int [] c = new int [12];
//
//int [] c (array variable)
//
//new int [12] (create the array and assign to the array variable)

//import java.util.Scanner;
//public class WorkSpace{
//    public static void main(String[]args){
//
//    Scanner input = new Scanner (System.in);
//
//    System.out.println("Enter first integer: ");
//    int firstInteger = input.nextInt();
//
//    System.out.println("Enter second integer: ");
//    int secondInteger = input.nextInt();
//
//    int squareOfFirstInteger = (int) Math.pow(firstInteger, 2);
//    int squareOfSecondInteger = (int) Math.pow(secondInteger, 2);
//
//    int sumOfSquares = squareOfFirstInteger + squareOfSecondInteger;
//    
//    int diffOfSquares = squareOfFirstInteger - squareOfSecondInteger;
//
//    System.out.printf("Show Results:\n%d\n%d\n%d\n%d\n", squareOfFirstInteger, squareOfSecondInteger, sumOfSquares, diffOfSquares);
//
//
//}
//
//}
//
//import java.util.Scanner;
//
//public class WorkSpace {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        // Get input
//        System.out.print("Enter first integer: ");
//        int firstInteger = input.nextInt();
//
//        System.out.print("Enter second integer: ");
//        int secondInteger = input.nextInt();
//
//        System.out.print("Enter third integer: ");
//        int thirdInteger = input.nextInt();
//
//        // Calculations
//        int sumOfIntegers = firstInteger + secondInteger + thirdInteger;
//        int averageOfIntegers = sumOfIntegers / 3;
//        int productOfIntegers = firstInteger * secondInteger * thirdInteger;
//
//        // Find largest
//        int largestInteger = firstInteger; // start with first
//        if (secondInteger > largestInteger) {
//            largestInteger = secondInteger;
//        }
//        if (thirdInteger > largestInteger) {
//            largestInteger = thirdInteger;
//        }
//        
//        int smallestInteger = firstInteger;
//        if (secondInteger < smallestInteger) {
//            smallestInteger = secondInteger;
//        }
//
//        if (thirdInteger < smallestInteger){
//            smallestInteger = thirdInteger;
//}
//
//        
//        System.out.printf("Sum Of Integers: %d\n", sumOfIntegers);
//        System.out.printf("Average Of Integers: %d\n", averageOfIntegers); 
//        System.out.printf("Product Of Integers: %d\n", productOfIntegers);
//        System.out.printf("Largest Integer: %d\n", largestInteger);
//        System.out.printf("Smallest Integer: %d\n", smallestInteger);
//    }
//}
//

//import java. util. Scanner;
//public class WorkSpace{
//
//    public static void main(String [] args){
//    
//    Scanner input = new Scanner(System.in);
//
//    System.out.println("Enter the radius of circle: ");
//
//    int radiusOfCircle = input.nextInt();
//
//    int diameterOfCircle = 2 * radiusOfCircle;
//
//    double circumferenceOfCircle = 2 * Math.PI * radiusOfCircle;
//    double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
//
//
//    System.out.printf("Diamter of Circle: %d\n", diameterOfCircle);
//    System.out.printf("Circumference of Circle: %.2f\n", circumferenceOfCircle);
//    System.out.printf("Area of Circle: %.2f\n", areaOfCircle);
//
//}
//
//
//




//import java.util.Scanner;
//public class WorkSpace{
//    public static void main(String[] args){
//
//    Scanner input = new Scanner(System.in);
//
//    int total = 0;
//    int gradeCounter = 1;
//    while (gradeCounter <= 10){
//
//    System.out.println("Enter grade: ");
//    int grade = input.nextInt();
//    total += grade;
//    gradeCounter = gradeCounter + 1;
//
//   
//    double average = (double)total/10;
//
//
//    System.out.printf("Total of all ten grades is %d\n", total);
//    System.out.printf("Average of all ten grades is %.2f\n", average);
//
//
//    
//}
//
//}







import java.util.Random;

public class WorkSpace {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Random integers between 0 and 9:");
        for (int count = 0; count < 5; count++) {
            int number = rand.nextInt(10); // 0 to 9
            System.out.println(number);
        }
    }
}


































