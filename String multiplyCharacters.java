//import java.util.Scanner; 
//public class CharacterMultiplier {
//   
//    public static void main(String[] args) {
//     Scanner input = new Scanner (System.in);
//    System.out.println("Enter a word: ");
//    String word = input.nextLine();
//    System.out.println("Enter a number: ");
//    int number = input.nextInt();
//
//     for (char ch : word.toCharArray()) {
//        result.append(String.valueOf(ch).repeat(number));
//    }
//
//    return result.toString();
//    }
//
//    }
//








public static String multiplyCharacters(String word, int number) {
    StringBuilder result = new StringBuilder();

    for (char ch : word.toCharArray()) {
        result.append(String.valueOf(ch).repeat(number));
    }

    return result.toString();
}

