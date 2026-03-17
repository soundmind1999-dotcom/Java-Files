import java.util.Scanner;
public class NumDaysWeeks{
    
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);



    System.out.println("Enter number of days: ");
    int numberofDays = input.nextInt();
    int remainder = numberofDays % 7;

    switch(remainder){

        case 1 -> System.out.printf("It will be Thursday in %d days time\n", numberofDays);

        case 2 -> System.out.printf("It will be Friday in %d days time\n", numberofDays);

        case 3 -> System.out.printf("It will be Saturday in %d days time\n", numberofDays);

        case 4 -> System.out.printf("It will be Sunday in %d days time\n", numberofDays);
        case 5 -> System.out.printf("It will be Monday in % days time\n", numberofDays);
        case 6 -> System.out.printf("It will be Tuesday in % days time\n", numberofDays);
        case 7 -> System.out.printf("It will be Wednesday in % days time\n", numberofDays);

}















}

















}
