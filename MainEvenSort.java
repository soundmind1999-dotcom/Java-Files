//public class MainEvenSort{
//    public static void main (String [] args){
//
//    int [] even = {4, 3, 2, 1};
//    for (int count = 0; count < even.length; count++){
//        for (int counter = count + 1; counter < even.length; counter++){
//
//        int temp = 0;
//        if (even[counter] < even[count]){
//        temp = even[count];
//        even[count] = even[counter];
//}
//
//        
//}
//
//}
//        System.out.print(even[count] + " ");
//}
//
//}


public class MainEvenSort {
    public static void main(String[] args) {

        int[] even = {4, 3, 2, 1};

     
        for (int count = 0; count < even.length; count++) {
            for (int counter = count + 1; counter < even.length; counter++) {

                if (even[counter] < even[count]) {

                    int temp = even[count];
                    even[count] = even[counter];
                    even[counter] = temp;  
                }
            }
        }

  
        for (int count = 0; count < even.length; count++) {
            System.out.print(even[count] + " ");
        }
    }
}

