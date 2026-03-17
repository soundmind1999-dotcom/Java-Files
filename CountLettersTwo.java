import java.util.Scanner;
import java.util.Arrays;
    public class CountLettersTwo{
        public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        String [] givenName = {"O", "l", "a", "l", "e", "k", "a", "n"};
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        int count = 0;
        for (int index = 0; index < givenName.length; index++){
            String alphabet = givenName[index];
            char alphabet = givenName.charAt(index);
            if (letter.equals(alphabet)){
            if (letter.equals(String.valueOf(alphabet))){
            count++;
}

}

        System.out.println("letter " + letter + " appeared " + count + " times");

}


}
