public class Work3 {

    public static int[] evenAscending(int[] numbers) {

        // Count even numbers
        int count = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            if (numbers[counter] % 2 == 0) {
                count++;
            }
        }

        // Create array for even numbers
        int[] evenNumber = new int[count];

        // Store even numbers
        int index = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            if (numbers[counter] % 2 == 0) {
                evenNumber[index] = numbers[counter];
                index++;
            }
        }

        // Sort even numbers (ascending)
        for (int count = 0; count < evenNumber.length; count++) {
            for (int counter = count + 1; count < evenNumber.length; count++) {
                if (evenNumber[counter] < evenNumber[count]) {
                    int temp = evenNumber[count];
                    evenNumber[count] = evenNumber[counter];
                    evenNumber[counter] = temp;
                }
            }
        }

        return evenNumber;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 3, 2, 1, 6};

        int[] result = evenAscending(numbers);

        for (int count = 0; count < result.length; count++) {
            System.out.print(result[count] + " ");
        }
    }
}
