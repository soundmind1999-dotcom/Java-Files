public class Practice {

    public static int[] getEvenAscending(int[] numbers) {

        // Step 1: Count even numbers
        int count = 0;
        for (int counter = 0; counter < numbers.length; i++) {
            if (numbers[counter] % 2 == 0) {
                count++;
            }
        }

        // Step 2: Store even numbers
        int[] evens = new int[count];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[index] = numbers[i];
                index++;
            }
        }

        // Step 3: Sort manually (Bubble Sort)
        for (int i = 0; i < evens.length - 1; i++) {
            for (int j = 0; j < evens.length - 1 - i; j++) {
                if (evens[j] > evens[j + 1]) {

                    // swap
                    int temp = evens[j];
                    evens[j] = evens[j + 1];
                    evens[j + 1] = temp;
                }
            }
        }

        return evens;
    }

    public static void main(String[] args) {

        int[] input = {2, 1, 6, 3, 4};

        int[] result = getEvenAscending(input);

        // Manual print (no Arrays.toString)
        System.out.print("(");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}




