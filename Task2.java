import java.util.Scanner;
public class Task2{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);
	
		int [] classScores = new int [10];

		for (int counter = 0; counter < classScores.length; counter++){
			System.out.printf("Enter score %d: ", (counter + 1));
			classScores[counter] = input.nextInt();
		}

		for (int count : classScores){
        System.out.println(count);
}
		}
		
	}

}

