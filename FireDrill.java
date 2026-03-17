public class FireDrill {

    
    public static int[] createArray(int totalNumber) {
        int[] numbersCreation = new int[totalNumber];
        for (int count = 0; count < numbersCreation.length; count++) {
            numbersCreation[count] = count + 1;
        }
        return numbersCreation;
    }

  
    public static void printAllNumbers(int[] numbersArray) {
        System.out.println("All numbers:");
        for (int number : numbersArray) {
            System.out.println(number);
        }
    }

    
    public static void printEvenNumbers(int[] numbersArray) {
        System.out.println("Even numbers:");
        for (int number : numbersArray) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

 
    public static void printOddNumbers(int[] numbersArray) {
        System.out.println("Odd numbers:");
        for (int number : numbersArray) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    
    public static int[] multiplesOfThree(int[] numbersArray) {
        int[] multiplesOf3 = new int[numbersArray.length];
        for (int counter = 0; counter < numbersArray.length; counter++) {
            if (numbersArray[counter] % 3 == 0) {
                multiplesOf3[counter] = numbersArray[counter];
            } else {
                multiplesOf3[counter] = 0;
            }
        }
        return multiplesOf3;
    }


    public static void printRepeated(int[] numbersArray) {
        System.out.print("Multiples of 3 repeated 4 times each:");
        for (int number : numbersArray) {
            if (number != 0) {
                for (int nCounter = 0; nCounter < 4; nCounter++) {
                    System.out.print(number);
                }
            
            }
        }
    }

 
    public static void main(String[] args) {
        int[] numbers = createArray(10);   
        printAllNumbers(numbers);          
        printEvenNumbers(numbers);       
        printOddNumbers(numbers);          

        int[] multiples = multiplesOfThree(numbers); 
        printRepeated(multiples);          
    }
}

