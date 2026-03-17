//public class Examples{
//
//    public int commonFactors(int [] numbers){
//    
//   
//    int commonFactor = 1;
//
//    for(int index = 0; index < numbers.length; index++){
//
//    if ((numbers[0] % commonFactor == 0) && (numbers[1] % commonFactor == 0) && (numbers[2] % commonFactor == 0)){
//    commonFactor++;
//
//    System.out.println("Common Factor" + commonFactor );
//}
//       
//}
//        
//}

import java.util.Scanner;

public class Examples {

    public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.println ("Enter first number: ");
    int number1 = input.nextInt();

    System.out.println ("Enter second number: ");
    int number2 = input.nextInt();

    for (int count = 1; count <= number1 && count <= number2; count++){

        if (number1 % count == 0 && number2 % count == 0){
            System.out.println(count);

}

}

  
}  


}





