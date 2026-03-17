public class TaskNine{
    public static void main(String[] args) {

        int sumOf4 = 0;
        int sumOf8 = 0;

        for (int count = 1; count <= 5; count++) {
            sumOf4 += Math.pow(4, count);
            sumOf8 += Math.pow(8, count);
        }

        int totalSum = sumOf4 + sumOf8;
       
        long squareTotalSum = (long) Math.pow(totalSum, 2);

        System.out.println(squareTotalSum);
    }
}

