public class JavaTask16 {

    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100:");

        for (int num = 2; num <= 100; num++) {  
            boolean isPrime = true;

            // Check divisibility from 2 to sqrt(num)
            for (int count = 2; count <= Math.sqrt(num); count++) {
                if (num % count == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
