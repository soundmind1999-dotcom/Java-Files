//public class KataKata{
//
//    public static void main(String[]args){
//
//        int[]numbers = [2,5,7,8,11];
//
//          for(int index=0; index<numbers.length; index++){
//
//            if (numbers[index] % 2 == 0){
//                numbers[index] = numbers[index] * numbers[index];
//                  }
//            else{
//                numbers[index] = numbers[index]++}
//}
//
//
//        for (int number:numbers)
//
//            System.out.print(number + " ");
//
//
//}
//}



//import java.util.Scanner;
//
//public class KataKata{
//
//    public static void main(String[]args){
//    
//    Scanner input = new Scanner(System.in);
//
//    int[] numbers = new int[5];
//
//        for (int index=0; index<numbers.length; index++){
//
//            System.out.println("Enter the number you want to put into the array");
//            numbers[index] = input.nextInt();
//
//            }
//       System.out.println(Array.deepToString(numbers));
//       for (int number : numbers){
//
//            System.out.print(number + " ");}
//
//
//}
//
//}
//
//

        import java.util.Scanner;
//        import java.util.Array;
        public class KataKata{

             public static void main(String[]args){

             int[][]matrix = { {1,2,3}, {4,5,6,10}, {7,8,9} };

                matrix[1][3] = 15;
                matrix[2][0] = 21;
               
                 for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++){


                    for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++){

                System.out.print(matrix[rowIndex] [columnIndex] + " ");

}


            System.out.println();

}

           // System.out.print(Arrays.deepToString(matrixOfNumbers));


      
                
                        
  


}





}

