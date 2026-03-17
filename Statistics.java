public class Statistics{

    public static double mean (double [] numbers);

        double sum = 0.0;
        for (int count = 0; count < numbers.length; count++){
        
        sum += numbers[count];
}
        return sum;

public static double mean (double [] numbers);

        double sum = 0.0;
        for (int count = 0; count < numbers.length; count++){
        
        sum += numbers[count];
}
        return sum / numbers.length;


    public static double mean (double [] numbers);

        double sum = 0.0;
        for (int count = 0; count < numbers.length; count++){
        
        sum += numbers[count];
}
        return sum / numbers.length;



    public static double variance (double [] numbers);

        double mean = mean(numbers);
        double sum = 0,0;
        for (int count = 0; count < numbers.length; count++){

        double difference = numbers[count] - mean;
        sum += difference * difference;

}
        return sum / numbers.length;

    public static double standardDeviation(double [] numbers);

        return Math.sqrt(variance(number));


}
