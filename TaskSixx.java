import java.util.Scanner;
public class TaskSix{

	public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    double sum = 0;

    for (int counter = 1; counter <= 10; ++counter){

        System.out.printf("Enter score %d%n", counter);

        double score = input.nextInt();
        
        if(score % 2 == 0){
             sum+= score;
}
           

}

        double average = sum / 5;
        System.out.printf("average of only the even scores is " + average);

    

	 

             
}



}






    

