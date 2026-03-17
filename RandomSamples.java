import java.security.SecureRandom;

public class RandomSamples {

    public static void main(String[] args) {

        SecureRandom input = new SecureRandom();

        for (int count = 1; count <= 20; count++) {

            int face = input.nextInt(6) + 1;

            System.out.printf("%d ", face);

            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
