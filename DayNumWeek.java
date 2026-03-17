import java.util.Scanner;

public class WeekDays{
	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter the number of days: ");
		int days = input.nextInt();


		switch (days % 7){

		case 1 -> System.out.printf("It will be Saturday in %d days time%n", days);
		case 2 -> System.out.printf("It will be Sunday in %d days time%n", days);
		case 3 -> System.out.printf("It will be Monday in %d days time%n", days);
		case 4 -> System.out.printf("It will be Tuesday in %d days time%n", days);
		case 5 -> System.out.printf("It will be Wednesday in %d days time%n", days);
		case 6 -> System.out.printf("It will be Thursday in %d days time%n", days);
		default -> System.out.printf("It will be Friday in %d days time%n", days);


}
}
}
