public class ArraysFunctions {

    
    public static int[] createArray(int totalNumber) {
        int[] numbersCreation = new int[totalNumber];
        for (int count = 0; count < numbersCreation.length; count++) {
            numbersCreation[count] = count + 1;
        }
        return numbersCreation;
    }

    
    public static void printAllNumbers(int[] numbersArray) {
        System.out.println("All numbers:");
        for (int number : numbersCreation) {
            System.out.println(number);
        }
    }

    
    public static void printEvenNumbers(int[] numbersCreation) {
        System.out.println("Even numbers: ");
        for (int number : numbersCreation) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

  
    public static void printOddNumbers(int[] numbersCreation) {
        System.out.println("Odd numbers:");
        for (int number : numbersCreation) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

     public static int[] multiplesOfThree(int[] numbersCreation) {
        int[] nonMultiplesOf3 = new int[numbersCreation.length];
        for (int count = 0; count < numbersArray.length; count++) {
            if (numbersCreation[count] % 3 == 0) {
                nonMultiplesOf3[index] = numbersCreation[count]; 
            } else {
                nonMultiplesOf3[index] = 0;
            }
        }
        return nonMultiplesOf3;
    }


     public static void nonZeroValue(int[] numbersArray) {
        for (int number : numbersCreation) {
            if (number != 0) {
             
                for (int counter = 0; counter < 4; counter++) {
                    System.out.print(number);
                }
                System.out.println(); 
            }
        }
    }


    
    
    }


