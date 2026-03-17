import java.util.Scanner;
public class TaskFive{

	public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int sum = 0;

    for (int counter = 1; counter <= 10; ++counter){

        System.out.printf("Enter score %d%n", counter);

        int score = input.nextInt();
        
        if(score % 2 == 0){
             sum+= score;
}
           

}

        System.out.printf("Sum of only the even scores is " + sum);

    

	 

             
}



}






    

