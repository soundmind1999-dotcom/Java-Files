import java.util.Scanner;

public class CountLetters{
    public static void main (String [] args){
    

    Scanner input = new Scanner(System.in);

    String givenName = "Banana";
    System.out.println("Enter a letter: ");
    String letter = input.nextLine();

    int count = 0;
    for (int index = 0; index < givenName.length(); index++){

    char alphabet = givenName.charAt(index);
    if (letter.equals(String.valueOf(alphabet))){
    count++;
}  
  }


        System.out.println("letter " + "appeared " + count + " times"); 
}

}
