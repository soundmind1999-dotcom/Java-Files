public static String multiplyCharacters(String word, int number) {
    String result = "";
    for (int counter = 0; counter < word.length(); counter++) {
        for (int count = 0; count < number; count++) {
            result += word.charAt(counter); // Concatenate character
        }
    }
    return result;
}
   public static void main(String[] args) {
        String output = multiplyCharacters("car", 3);
        System.out.println(output); 






public class CharacterMultiplier {
   
    
public static String multiplyCharacters(String word, int number) {
    StringBuilder result = new StringBuilder();

    for (char ch : word.toCharArray()) {
        result.append(String.valueOf(ch).repeat(number));
    }

    return result.toString();
}

