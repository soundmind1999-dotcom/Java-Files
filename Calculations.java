//int [] c = new int [12];
//
//int [] c (array variable)
//
//new int [12] (create the array and assign to the array variable)

import java.util.Scanner:
public class Calculations{
    public static void main(String[]args){

    Scanner input = new Scanner (System.in);

    System.out.println("Enter first integer: ");
    int firstInteger = input.nextInt();

    System.out.println("Enter second integer: ");
    int secondInteger = input.nextInt();

    int squareOfFirstInteger = firstInteger ** 2;
    int squareOfSecondInteger = secondInteger ** 2;

    int sumOfSquares = squareOfFirstInteger + squareOfSecondInteger;
    
    int diffOfSquares = squareOfFirstInteger - squareOfSecondInteger;

    System.out.println("Show Results: %d\n%d\n%d\n%d", squareOfFirstInteger, squareOfSecondInteger, sumOfSquares, diffOfSquares);
}

}
