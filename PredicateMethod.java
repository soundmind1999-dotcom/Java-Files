public class PredicateMethod {

    public static boolean [] checkEven(int[] input) {
        boolean [] output = new boolean[input.length];

        for (int count = 0; count < input.length; count++) {
            output[count] = isEven(input[count]);
        }

            return output;
 }

    public static boolean isEven(int num) {
        return num % 2 == 0;
 }

    public static void main(String[] args) {
        int [] input = {2, 5, 7, 1, 6, 9};
        boolean [] result = checkEven(input);

        for (boolean b : result) {
            System.out.print(b + " ");
}
  }
}
   



}
