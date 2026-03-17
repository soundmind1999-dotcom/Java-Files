import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Random integers between 0 and 9:");
        for (int i = 0; i < 5; i++) {
            int number = rand.nextInt(10); // 0 to 9
            System.out.println(number);
        }
    }
}






import java.util.Random;

public class RandomDemo {

public static void main (String [] args){

Random rand = new Random();

System.out.println("Five Random Integers between 0 and 9");

for (int count = 0; count < 5; count++){
    System.out.println(rand.nextInt(10));

}

}
}
