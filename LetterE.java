public class LetterE{

    public static void main(String[] args) {

        String text = "Experience";
        
        int count = 0;

        for (int index = 0; index < text.length(); index++) {

            char ch = text.charAt(index);

            if (ch == 'e' || ch == 'E') {
                count++;
            }
        }

        System.out.println("Number of e's: " + count);
    }
}
