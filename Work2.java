=public class Work2{
    public static int [] evenAscending (int [] numbers){
    
    int count = 0;
    for (int counter = 0; counter <= numbers.length; counter++){
    if (numbers[counter] % 2 == 0){
    count++;
}

}

    int [] evenNumber = new int [count];
    int index = 0;
    for (int counter = 0; counter <= numbers.length; counter++){
        if (numbers[counter] % 2 == 0){
        even[index] = numbers[counter];
        index++;

}
}



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


