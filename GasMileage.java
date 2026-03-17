import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven: ");
        miles = input.nextInt();

       
        while (miles != -1) {

            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

           
            double tripMPG = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", tripMPG);

         
            totalMiles += miles;
            totalGallons += gallons;

           
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n%n", combinedMPG);

            
            System.out.print("Enter miles driven: ");
            miles = input.nextInt();
        }

        System.out.println("Program terminated.");
        input.close();
    }
}

