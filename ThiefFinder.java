//import java.util.Scanner;
//
//    public class ThiefFinder{
//
//
//        public static void main(String [] args){
//
//
//        Scanner input = new Scanner(System.in);
//
//        String name = input.nextLine();
//
//        int counter = 1;
//
//        while (!nameOfThief.equals("Thief")){
//
//        System.out.print("Enter nameOfThief: " + counter );
//            
//
//
//        
//
//            
//
//          
//        
//
//
//
//        }    
//    
//            
//        
//    
//        
//
//
//
//
//
//
//
//
//
//
//}
//
//
//
//
//
//
//}


















import java.util.Scanner;

public class ThiefFinder{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nameOfThief = " ";

        while(!nameOfThief.equals("Thief")){

            System.out.println("Who is the thief?");

            nameOfThief = input.nextLine();

        }



        System.out.print("We've caught the thief");

    }
}
