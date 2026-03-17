public class TapSwap{

    public static int [] swapArrayOf(int [] numbers) {
    int [] numbers = [5, 7, 6, 3, 2, 4];

    if (numbers % 2 == 0){

        for (int count = 0; count < numbers.length; count+=2){
            int tempNum = numbers[count];
            numbers[count] = numbers[count + 1];
            numbers[count + 1] = tempNum;      
            }
}
    else {
        for (int count = 0; count < numbers.length-1; count+=2){
            int tempNum = numbers[count];
            numbers[count] = numbers[count + 1];
            numbers[count + 1] = tempNum;      
            }
        
}
       return numbers;
   }

    public static int [] swapArrayOf(int [] numbers) {
    int lengthOfArray = 0;
    if(isEven(numbers)) lengthOfArray = getLength(numbers);
    else lengthOfArray = getLength(numbers) -1;
    for (int index = 0; index < length; index+=2){
    int temp = numbers[index];
    numbers[index] = numbers [index + 1];
    numbers[index + 1] = temp;
    
}


    return numbers







