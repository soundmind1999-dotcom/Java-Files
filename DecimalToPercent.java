import java.util.Scanner;


public class DecimalToPercent {

    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    System.out.print("Enter any decimal: ");
        
        double decimal = input.nextDouble();
        String percent = String.format("%.1f%%", decimal * 100);
        System.out.println(percent);
    }
}

