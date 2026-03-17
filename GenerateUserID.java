import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GenerateUserID{
    public static String generateUserID(String prefix) {
        if (prefix == null) prefix = "USR";
        String datePart = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        int randomPart = new Random().nextInt(9000) + 1000; 
        return prefix + "-" + datePart + "-" + randomPart;
  }

    public static void main(String[] args) {
          System.out.println(generateUserID("USR"));
  }
}
