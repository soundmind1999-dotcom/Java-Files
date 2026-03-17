import java.util.Arrays;

public class DoubleArray {

    public static int [] doubleArray(int [] input) {

        int number = input.length;
        int[] output = new int[number * 2];

        for (int count = 0; count < number; count++) {
            output[count] = input[count];
  }

        for (int count = 0; count < number; count++) {
            output[count + number] = input[count] * 2;
}

        return output;
   }

    public static void main(String[] args) {

        int [] input = {2, 6, 7, 1, 5};

        int [] result = doubleArray(input);

        System.out.println(Arrays.toString(result));
  }
}
