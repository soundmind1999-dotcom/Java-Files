public class FireDrill4 {

public static void main(String[] args) {

    // Function to create an array of numbers from 1 to maxNumber
    public static int[] createArrayTask1(int maxNumber) {
        int[] numbersArray = new int[maxNumber];
        for (int index = 0; index < numbersArray.length; index++) {
            numbersArray[index] = index + 1;
        }
        return numbersArray;
    }

}

}

//     // Function to print all even numbers in an array
//    public static void evenNumbersTask2(int[] numbersArray) {
//        System.out.println("Even numbers:");
//        for (int evenNumber : numbersArray) {
//            if (number % 2 == 0) { // Only non-zero even numbers
//                System.out.println(evenNumber);
//            }
//        }
//    }
//
//    
//    // Function to print all odd numbers in an array
//    public static void OddNumbersTask3(int[] numbersArray) {
//        System.out.println("Odd numbers:");
//        for (int oddNumber : numbersArray) {
//            if (number % 2 != 0) { // Only non-zero odd numbers
//                System.out.println(oddNumber);
//            }
//        }
//    }
//
//    // Function to keep multiples of 3 and replace others with 0
//    public static int[] multiplesOf3Task4(int[] numbersArray) {
//        int[] nonMultiplesOf3 = new int[numbersArray.length];
//        for (int index = 0; index < numbersArray.length; index++) {
//            if (numbersArray[index] % 3 == 0) {
//                nonMultiplesOf3[index] = numbersArray[index];
//            } else {
//                nonMultiplesOf3[index] = 0;
//            }
//        }
//        return nonMultiplesOf3;
//    }
//
//    // Function to square each value in an array
//    public static int[] squareArrayTask6(int[] numbersArray) {
//        int[] squareOfArray = new int[numbersArray.length];
//        for (int index = 0; index < numbersArray.length; index++) {
//            squareOfArray[index] = numbersArray[index] * numbersArray[index];
//        }
//        return squareOfArray;
//  
//  
//
//    
