public class NaturalNumbers {

    public static void main(String[] args) {

        System.out.println("Sum of natural numbers from 1 to 50:");

        int total = 0;

        for (int count = 1; count <= 50; count++) {
            total += count;   
        }

        System.out.println(total);
    }
}
